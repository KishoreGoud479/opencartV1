package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{
	
	@Test(groups={"regression","master"})
	public void test_accout_Registration()
	{
		logger.info(" Starting TC_001_AccountRegistration ");
		
		try
		{
			driver.get(rd.getString("appURL"));
			logger.info("Home Page Displayed ");
			
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			hp.clickRegister();
			logger.info("Clicked on Register ");
			
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			regpage.setFirstName("John");
			logger.info("Provided First Name ");
			
			regpage.setLastName("Canedy");
			logger.info("Provided Last Name ");
			
			regpage.setEmail(randomestring()+"@gmail.com");
			logger.info("Provided Email ");
			
			regpage.setTelephone("65656565");
			logger.info("Provided Telephone ");
			
			regpage.setPassword("abcxyz");
			logger.info("Provided Password ");
			
			regpage.setConfirmPassword("abcxyz");
			logger.info("Provided Confrmed Password ");
			
			regpage.setPrivacyPolicy();
			logger.info("Set Privacy Policy ");
			
			regpage.clickContinue();
			logger.info("Clicked on Continue ");
			
			String confmsg=regpage.getConfirmationMsg();
			
			if(confmsg.equals("Your Account Has Been Created!"))
			{
				logger.info("Account Registration Success ");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Account Registration Failed ");
				captureScreen(driver, "test_accout_Registration"); //Capturing screenshot
				Assert.assertTrue(false);
			}
		}	
		catch(Exception e)
		{
			logger.fatal("Account Registration Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_001_AccountRegistration ");
		
	}
	
	
}
