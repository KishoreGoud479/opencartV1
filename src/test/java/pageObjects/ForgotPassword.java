package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword  {

	WebDriver driver;
	public ForgotPassword(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	WebElement lnkForgotPwd;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}
	public void clickForgotPwd()
	{
		lnkForgotPwd.click();
	}
	
	public void text_Email(String email)
	{
		txt_email.sendKeys(email);
	}
	public void clickContinue()
	{
		btn_continue.click();
	}
	
}
