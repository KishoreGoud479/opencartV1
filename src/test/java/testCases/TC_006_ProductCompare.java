package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductCompare;
import testBase.BaseClass;

public class TC_006_ProductCompare extends BaseClass {
	
	@Test
	public void test_ProductComapre() throws InterruptedException
	{
		logger.info(" Starting TC_006_ProductCompare ");
		
		driver.get(rd.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		ProductCompare pc=new ProductCompare(driver);
		pc.searchtxt("imac");
		Thread.sleep(3000);
		logger.info("Enter any Product"); 
		pc.clickbutton();
		
		pc.clcikcompare();
		logger.info("Product compare");
		Thread.sleep(3000);
		pc.clcikProcuctCompare();
		Thread.sleep(2000);
		
			
	}

}
