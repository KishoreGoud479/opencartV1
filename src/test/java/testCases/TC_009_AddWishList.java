package testCases;

import org.testng.annotations.Test;

import org.testng.Assert;
import pageObjects.AddWishList;
import pageObjects.HomePage;

import testBase.BaseClass;

public class TC_009_AddWishList extends BaseClass {
	
	@Test
	public void test_AddWishList()
	{
		logger.info("Starting TC_009_AddWishList");
		try
		{
		driver.get(rd.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("Home Page Displayed ");
		driver.manage().window().maximize();
				
		AddWishList awl=new AddWishList(driver);
		awl.SerachProduct("Imac");
		logger.info("clicked the search button");
		
		awl.Clickbutton();
		
		awl.ClickOnImage();
		logger.info("clicked on image");
		awl.AddWishlist();
		logger.info("clicked on addwishlist");
		
		 boolean tarpage=awl.isPageExists();
		    
		    if(tarpage)
		    {
		    	logger.info("WishList Success ");
				Assert.assertTrue(true);
		    }
		    
		    else
			{
				logger.error("Search Fail ");
				captureScreen(driver, "test_AddWishList"); //Capturing screenshot
				Assert.assertTrue(false);
			}
		}	
		catch(Exception e)
		{
			logger.fatal("WishList Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_009_AddWishList ");
		
		
	}

}
