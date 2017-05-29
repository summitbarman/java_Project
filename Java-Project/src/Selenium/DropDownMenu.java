package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");
		WebElement feature=driver.findElement(By.xpath("//a[text()='Features']"));
		//feature.click();
//	driver.findElement(By.className("selected-item")).click();
		//Actions action=new Actions(driver);
		//action.moveToElement(wb).click().build().perform();
		//driver.findElement(By.className("selected-item")).click();
	}
}
