package testCases;


import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import pageObjects.Checkout;
import testBase.BaseClass;

public class TC_011_Checkout extends BaseClass{
	
	@Test()
	public void test_TC_011_Checkout() throws InterruptedException, IOException
	{
		try
		{
			
		logger.info("test TC_011_Checkout started....");
		driver.get(rd.getString("appURL"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Checkout co=new Checkout(driver);
		
		co.Searchproduct();
		logger.info("Searching product ");
		Thread.sleep(3000);
		
		co.Clickonserach();
		logger.info("click on Searching button");
		co.Clickonimage();
		
		co.ClickonAddcart();
		Thread.sleep(3000);
		logger.info("Added product into Addcart");
		co.clcikonShoppingcart();
		logger.info("Clicked on shoppingcart");
		
		co.clcikonShoppingcart();
		Thread.sleep(3000);
		
		Boolean targetpage=co.isPageExists();
		if(targetpage)
		{
			Assert.assertTrue(true);
			logger.info("Checkout successfull");
		}
		else
		{
			captureScreen(driver, "test_Checkout");
			Assert.assertTrue(false);
			logger.info("Checkout failed");
		}
		}
		
		catch(Exception e) 
		{
			logger.fatal("checkout Test failed");
			Assert.fail();
		}
	
		logger.info(" Finished TC_010_ShoppingCart");		
		
	}
	
}
