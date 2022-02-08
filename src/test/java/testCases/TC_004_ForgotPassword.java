package testCases;

import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_004_ForgotPassword extends BaseClass {
	@Test
	public void test_Forgotpassword()
	{
		logger.info(" Starting TC_004_ForgotPassword ");
		
		
		driver.get(rd.getString("appURL"));
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		logger.info(" Opening Homepage ");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account ");
		hp.clickLogin();
		logger.info("Clicked on Login ");
		
		logger.info(" clicking on forgotpasswword ");
		
		ForgotPassword fb=new ForgotPassword(driver);
		fb.clickForgotPwd();
		logger.info(" entered email id ");
		fb.text_Email("email");
		fb.clickContinue();
		logger.info(" An email with a confirmation link has been sent your email address.. ");
		


	}
	
	
	
}
