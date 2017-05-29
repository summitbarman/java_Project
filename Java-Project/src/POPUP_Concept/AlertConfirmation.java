package POPUP_Concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConfirmation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.irctc.com/Emp_Login.jsp");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(3000);
		try
		{
			Alert alert=driver.switchTo().alert();
			String str=alert.getText();
			System.out.println(str);
			alert.accept();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert is Not Present!");
		}
		
	}
}
