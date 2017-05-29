package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownConcept 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		WebElement menu1=driver.findElement(By.xpath("//a[text()='Features']"));
		Actions action=new Actions(driver);
		action.contextClick(menu1).sendKeys("T").perform();
		
	}
}


