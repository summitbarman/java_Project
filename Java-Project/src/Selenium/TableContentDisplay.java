package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableContentDisplay 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/TYSS/Desktop/table.html");
		List<WebElement> allTr=driver.findElements(By.xpath("//tr"));
		for(int i=0;i<allTr.size();i++)
		{
			WebElement tr=allTr.get(i);
			List<WebElement> allTd=tr.findElements(By.xpath("//td"));
			for(int j=0;j<allTd.size();j++)
			{
				WebElement td=allTd.get(j);
				String text=td.getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
	}
}
