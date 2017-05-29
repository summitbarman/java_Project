package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=M5sSWbrMNIXy8AfmlLGwDQ#q=news");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='g']"));
		int count=list.size();
		/*
		for(int i=0;i<count;i++)
		{
			WebElement link=list.get(i);
			String l_text=link.getText();
			System.out.println(l_text);
		}
		*/
		System.out.println("Total Number of Links present on the web page is "+count);
		/*
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'NDTV:')]"));
		link.click();
		*/
	}
}