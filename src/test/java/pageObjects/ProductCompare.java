package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCompare {
	
	WebDriver driver;
	
	public ProductCompare(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_txt;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement ser_butn;
	@FindBy(xpath="//i[@class='fa fa-exchange']")
	WebElement clk_compare;
	@FindBy(xpath="//a[normalize-space()='product comparison']")
	WebElement clk_product;
	
	public void searchtxt(String text)
	{
		search_txt.sendKeys(text);
	}
	public void clickbutton()
	{
		ser_butn.click();
	}
	public void clcikcompare()
	{
		clk_compare.click();
			
	}
	public void clcikProcuctCompare()
	{
		clk_product.click();
	}
	

		

}
