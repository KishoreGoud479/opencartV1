package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class TC_010_ShoppingCart extends BaseClass{
	
	@Test
	public void test_ShoppingCart() throws InterruptedException, IOException
	{
		try
		{
		logger.info("TC_010_Shoppingcart test case started");
		
		driver.get(rd.getString("appURL"));
		logger.info("Home Page Displayed");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		ShoppingCart cart=new ShoppingCart(driver);
		cart.Searchproduct();
		logger.info("Searching product ");
		Thread.sleep(3000);
		
		cart.Clickonserach();
		logger.info("click on Searching button");
		cart.Clickonimage();
		
		cart.ClickonAddcart();
		Thread.sleep(3000);
		logger.info("Added product into Addcart");
		cart.clcikonShoppingcart();
		Thread.sleep(3000);
		logger.info("Clicked on shoppingcart");
		
		Boolean targetpage =cart.isPageExists();
		
		if(targetpage)	
		{
			logger.info("Shopping cart successfull");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver, "test_ShoppingCart"); //Capturing screenshot
			Assert.assertTrue(false);
			logger.info("Shopping cart failed");
		}
	}
		
		catch(Exception e)
		{
			logger.fatal("Soppingcart failed");
			Assert.fail();
		}
		
		logger.info(" Finished TC_010_ShoppingCart");
				
	}
	
}
