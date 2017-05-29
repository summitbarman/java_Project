package Selenium;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=image+with+test+on+it&client=firefox-b-ab&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjZ5fXR-t_TAhXpK8AKHcqDDvMQ_AUICigB&biw=1600&bih=791#imgrc=HSWUEZSNw9nfYM:");
		String text=driver.findElement(By.xpath("(//img[@class='rg_ic rg_i'])[4+2]")).getAttribute("src");
		URL url=new URL(text);
		Image image=ImageIO.read(url);
		String s=new OCR().recognizeCharacters((RenderedImage)image);
		

		
	}
}
