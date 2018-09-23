package flipkart.flipkart.com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import flipkart.com.base.CustomClass;

public class HomePage extends CustomClass{
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement closebtn;
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@class=\"vh79eN\"]")
	private WebElement searchbtn;
	
	
	public WebElement getClosebtn() {
		return closebtn;
	}


	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	

}
