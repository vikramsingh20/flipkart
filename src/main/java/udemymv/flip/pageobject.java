package udemymv.flip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobject {

	public static WebDriver driver;
	public pageobject(WebDriver driver)
	{
		pageobject.driver=driver;
	}
	
	
	public WebElement cross() {
		
		return driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	}
	
	
	
	public WebElement move() {
		return driver.findElement(By.xpath("//div[@class='exehdJ']"));
	}
	
	
	
	public WebElement sell() {
		return driver.findElement(By.xpath("//*[text()='Sell on Flipkart']"));
	}

	
}
