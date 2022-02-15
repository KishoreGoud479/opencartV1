package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage_02;
import testBase.BaseClass;

public class TC_012_Homepage extends BaseClass{
	
	@Test()
	public void test_TC_012_Homepage() throws InterruptedException, IOException
	{
		
		try
		{
			logger.info("TC_012_Homepage started");
		
		driver.get(rd.getString("appURL"));
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Homepage_02 hpg=new Homepage_02(driver);
		hpg.Searchproduct();
		logger.info("Searching product");
		hpg.Clickonserach();
		hpg.Clickonimage();
		hpg.ClickonAddcart();
		Thread.sleep(5000);
		logger.info("Searching product");
		
		hpg.clcikonShoppingcart();
		Thread.sleep(3000);
		hpg.clickoncontinue();
		Thread.sleep(5000);
		
		Boolean targetpage=hpg.isPageExists();
		if(targetpage)
		{
			Assert.assertTrue(true);
			logger.info("Homepage_02 successfull");
		}
		else
		{
			captureScreen(driver, "test_Homepage_02");
			Assert.assertTrue(false);
			logger.info("Homepage_02 failed");
		}
		}
		catch(Exception e)
		{
			logger.fatal("Homepage test failed");
			Assert.fail();
			
		}
		
		logger.fatal("TC_012_Homepage_02 test failed");
		
	}
	
}
