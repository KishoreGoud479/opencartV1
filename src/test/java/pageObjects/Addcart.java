package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
	WebDriver driver;
	
	public Addcart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txt_productname;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement enter;
	
	@FindBy(xpath="//img[@title='iMac']")
	WebElement clk_img;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement add_cart;
	
	@FindBy(xpath="//span[@id='cart-total']")
	WebElement view_cart;
	
	@FindBy(xpath="//strong[normalize-space()='View Cart']")
	WebElement view;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement msgconfm;
	
	public void Search_Product()
	{
		txt_productname.sendKeys("Imac");
	}
	
	public void Enter()
	{
		enter.click();
	}
	
	public void ClickonImage() 
	{
		clk_img.click();
		
	}
	public void ClickonAddcart()
	{
		add_cart.click();
	}
	public void ClickonViewcart()
	{
		view_cart.click();	
	}
	public void ClickonView()
	{
		view.click();
	}
	
	public String getConfirmationMsg()
    {
  	  try
  	  {
  		  return (msgconfm.getText());
  	  }
  	  catch(Exception e)
  	  {
  		  return(e.getMessage());
  			  
  	  }

    }	
}
