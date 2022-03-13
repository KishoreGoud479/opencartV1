package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adressbook {
	
	WebDriver driver;
	
	public Adressbook(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	@FindBy(xpath="//a[text()='Address Book']")
	WebElement addressbook;
	
	@FindBy(xpath="//a[normalize-space()='New Address']")
	WebElement newaddress;
	
	@FindBy(xpath="//a[text()='Back']")
	WebElement backbutton;
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	 public void address_book()
     {
  	   addressbook.click();
     }
     public void newaddress_book()
     {
  	   newaddress.click();
     }
     
     public void back_button()
     {
  	   backbutton.click();
     }

}
