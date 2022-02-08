package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.Addcart;
import testBase.BaseClass;

public class TC_008_Addcart extends BaseClass{
	
	@Test()
	
	public void Test_Addcart() throws InterruptedException
	{
		logger.info(" Starting TC_008_Addcart ");
		try
		{
		driver.get(rd.getString("appURL"));
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Addcart adc=new Addcart(driver);
		adc.Search_Product();
		logger.info("Searching product ");
		
		adc.Enter();
		logger.info("clciked on enetr ");
		adc.ClickonImage();
		logger.info("clciked on Image ");
		Thread.sleep(3000);
		adc.ClickonAddcart();
		logger.info("Added the product into cart ");
		
		adc.ClickonViewcart();
		Thread.sleep(3000);
		logger.info("product added to viewcart");
		
		adc.ClickonView();
		Thread.sleep(3000);
		logger.info("product added to view");
		
		String confmg=adc.getConfirmationMsg();
		
		if(confmg.equals("Success: You have added iMac to your shopping cart!"))
        	
 		{
        	 logger.info("Search page is Success ");
 			  Assert.assertTrue(true);
 		}
 		else
 		{
 			logger.error("Add cart  Page Failed ");
			captureScreen(driver, "test_Addcart"); 
			
			Assert.assertTrue(false);
 			
 		}
    	}
    	catch(Exception e)
    	{
    	logger.fatal("Add cart  Failed");
    	Assert.fail();
    	
    	}
    	logger.info("Finished TC_005_Addcart");
    	
		
	}
	
	

}
