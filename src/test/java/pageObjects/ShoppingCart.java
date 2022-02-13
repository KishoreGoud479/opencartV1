package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	WebDriver driver;
	
	public ShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement text_search;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement clk_search;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement clk_img;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement clk_addcart;
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement clk_shoppingcart;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement pageexists;
	
	public void Searchproduct()
	{
		text_search.sendKeys("Imac");
	}

	public void Clickonserach()
	{
	
		clk_search.click();	
	}
	
	public void Clickonimage()
	{
		clk_img.click();
	}
	
	public void ClickonAddcart()
	{
		clk_addcart.click();
	}
	public void clcikonShoppingcart()
	{
		clk_shoppingcart.click();
	}
	
	public boolean isPageExists()
	{
		
	try
	{
	return (pageexists.isDisplayed());
	}
	
	catch(Exception e)
	{
		return(false);
	}
	
}
		
}



