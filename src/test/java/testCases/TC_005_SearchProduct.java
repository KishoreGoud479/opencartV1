package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import pageObjects.SearchProduct;
import testBase.BaseClass;

public class TC_005_SearchProduct extends BaseClass {
	
	@Test
	public void  test_SearchProduct() throws InterruptedException
	{
	logger.info(" Starting TC_005_SearchProduct ");
	
	try
	{
	   driver.get(rd.getString("appURL"));
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	
	   SearchProduct sp=new SearchProduct(driver);
	   
	   sp.searchtxt("iPhoness");
	    //sp.searchtxt("iMac");
	    Thread.sleep(2000);
	    logger.info("Enter any Product"); 
	
	    sp.searchbutton();
	    Thread.sleep(1000);
	    
	   
	    boolean tarpage=sp.isPageExists();
	    
	    if(tarpage)
	    {
	    	logger.info("Search Success ");
			Assert.assertTrue(true);
	    }
	    
	    else
		{
			logger.error("Search Failed ");
			captureScreen(driver, "SearchProduct"); //Capturing screenshot
			Assert.assertTrue(false);
		}
	}	
	catch(Exception e)
	{
		logger.fatal("Search Failed ");
		Assert.fail();
	}
	
	logger.info(" Finished TC_005SearchProduct ");
	
}
     }
	    
