package udemymv.flip;


import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends base {

	@BeforeTest
	public void browser()
	{
		driver =launchbrowser();
		
	}
	
	@Test
	public void flip() throws InterruptedException, IOException {
		
		pageobject ref1=new pageobject(driver);
		ref1.cross().click();
	
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ref1.move()).build().perform();
		
		ref1.sell().click();
		//Check for page title
		Assert.assertEquals(driver.getTitle(),"Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce");
		
		
	}
	
	
	
	
}
