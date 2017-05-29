package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeImage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		Actions action=new Actions(driver);
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		action.clickAndHold(searchBox).moveByOffset(50, 20).release().build().perform();
		Thread.sleep(5000);
	}
}
