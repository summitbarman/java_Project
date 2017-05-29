package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/listBox.html");
		WebElement list=driver.findElement(By.xpath("//select[@id='mtr']"));
		Select select=new Select(list);
		List<WebElement> allOptions=select.getOptions();
		/*ArrayList<String> allText=new ArrayList<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			allText.add(text);
		}
		Collections.sort(allText);
		for(String t:allText)
		{
			System.out.println(t);
		}*/
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			if(text.equals("punewwww"))
			{
				System.out.println(text+" is present in the list");
				
			}
		}
	}
}
