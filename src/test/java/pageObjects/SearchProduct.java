package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	WebDriver driver;
	
	public SearchProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement text_search;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement clk_search;
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement msgco;
	
	public void searchtxt(String text)
      {
		text_search.sendKeys(text);
      }
	
	public void searchbutton() 
	{
		clk_search.click();
	}
	
	public boolean isPageExists()
	{
		try
		{
		return (msgco.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
				
}
	
