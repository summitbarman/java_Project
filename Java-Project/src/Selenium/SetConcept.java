package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SetConcept 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/listBox.html");
		WebElement listBox=driver.findElement(By.xpath("//select[@id='mtr']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select select=new Select(listBox);
		select.selectByIndex(0);
		select.selectByIndex(2);
	}
}
