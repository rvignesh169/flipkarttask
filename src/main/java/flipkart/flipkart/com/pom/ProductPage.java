package flipkart.flipkart.com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flipkart.com.base.CustomClass;

public class ProductPage extends CustomClass {
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='_35KyD6']")
	private WebElement expphone;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement cartbtn;

	public WebElement getExpphone() {
		return expphone;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}
	
	
}
