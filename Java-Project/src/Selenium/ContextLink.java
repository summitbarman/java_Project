package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in");
		WebElement link=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions action=new Actions(driver);
		action.contextClick(link).perform();
		action.sendKeys("T").perform();
	}
}
