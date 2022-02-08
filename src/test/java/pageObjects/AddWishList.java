package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishList {
	WebDriver driver;
	
	public AddWishList(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_product;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement click_btn;
	@FindBy(xpath="//img[@title='iMac']")
	WebElement clkon_img;
	@FindBy(xpath="//div[@id='product-product']//div[@class='btn-group']//button[1]")
	WebElement addwish;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement pagedisplayed;
	
	public void SerachProduct(String name)
	{
		search_product.sendKeys(name);
	}
	public void Clickbutton() 
	{
		click_btn.click();
	}
	public void ClickOnImage()
	{
		clkon_img.click();
	}
	public void AddWishlist()
	{
		addwish.click();
	}
	public boolean isPageExists()
	{
		try
		{
			return(pagedisplayed.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
		
}
		
