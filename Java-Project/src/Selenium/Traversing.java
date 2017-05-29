package Selenium;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traversing 
{
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/table.html");
		/*
		driver.get("https://www.orangehrm.com/");
		WebElement text=driver.findElement(By.xpath("//a[@title='Hr System Contact']"));
		String ph_no=text.getText();
		System.out.println(ph_no);
		
		
		//XPATH of if the row is keep on changing.
		WebElement element=driver.findElement(By.xpath("//td[text()='MATH']/../td[@id='33']"));
//		WebElement element_1=driver.findElement(By.xpath("//td[.='SQL']/../td[1]"));
		String text=element.getText();
		System.out.println("The Price of MATH Book is - "+text+"/-");
//		String text_1=element_1.getText();
//		System.out.println("The Serial Number of Unix is - "+text_1);
		//XPATH of if the column is keep on changing.
		List lb = new List();
		
		*/
		
		/*try
		{
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException e1)
		{
			System.out.println("It is throwing "+e1);
		}
		catch(Exception e){
			System.out.println("This is Second catch block "+e);
		}
		finally
		{
			System.out.println("This is my finally block");
		}
		*/
		
		//find the font size of the Text Box
		/*WebElement textBox=driver.findElement(By.xpath("//input[@id='xyz']"));
		String font=textBox.getCssValue("font-color");
		System.out.println(font);*/
		/*
		//delete first and last two character from the text box.
		WebElement t_box=driver.findElement(By.xpath("//input[@id='xyz']"));
		for(int i=1;i<=2;i++) //delete last two characters.
		{
			t_box.sendKeys(Keys.BACK_SPACE);
		}
		t_box.sendKeys(Keys.HOME);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i=1;i<=2;i++)
		{
			t_box.sendKeys(Keys.DELETE);
		}
		*/
		/*
		int l1=driver.findElement(By.xpath("//input[@id='xyz']")).getSize().getHeight();
		int l2=driver.findElement(By.xpath("//input[@id='pqr']")).getSize().getWidth();
		System.out.println(l1);
		System.out.println(l2);
		if(l1==l2)
		{
			System.out.println("test is passes");
		}
		else
		{
			System.out.println("test is not passes");
		}*/
/*
		// text box is displayed or not
		WebElement textB=driver.findElement(By.xpath("//input[@id='xyz']"));
//		if(textB.isSelected())
		if(textB.isDisplayed())
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
*/		
		WebElement textBox=driver.findElement(By.xpath("//input[@id='xyz']"));
		try
		{
			textBox.sendKeys("SUMIT");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 