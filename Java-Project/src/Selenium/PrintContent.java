package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/listBox.html");
		WebElement listbox=driver.findElement(By.id("mtr"));
		Select select=new Select(listbox);
		List<WebElement> options=select.getOptions();
		ArrayList<String> allText=new ArrayList();
		for(int i=0;i<options.size();i++)
		{
			String texts=options.get(i).getText();
			if(texts.equals("banagalore"))
			{
				System.out.println("yes");
			}
			allText.add(texts);
		}
		Collections.sort(allText);
		for(String t: allText)
		{
			System.out.println(t);
		}
	}
}
