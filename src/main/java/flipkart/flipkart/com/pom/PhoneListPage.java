package flipkart.flipkart.com.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flipkart.com.base.CustomClass;

public class PhoneListPage extends CustomClass {

	public PhoneListPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	private List<WebElement> phonelist;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement l2h;
	
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']")
	private List<WebElement> pricelist;

	public List<WebElement> getPhonelist() {
		return phonelist;
	}

	public WebElement getL2h() {
		return l2h;
	}

	public List<WebElement> getPricelist() {
		return pricelist;
	}
	
	
}
