package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://beej.us/blog/data/drag-n-drop/");
		
		Actions action=new Actions(driver);
		WebElement g1=driver.findElement(By.xpath("//img[@id='goat0']"));
		WebElement g2=driver.findElement(By.xpath("//img[@id='goat2']"));
		action.dragAndDrop(g1, g2).perform();
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		
	}
}
