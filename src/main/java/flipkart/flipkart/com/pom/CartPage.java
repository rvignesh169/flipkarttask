package flipkart.flipkart.com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flipkart.com.base.CustomClass;

public class CartPage extends  CustomClass{
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='_325-ji _3ROAwx']")
	private WebElement actphone;

	public WebElement getActphone() {
		return actphone;
	}
	
	
}
