package flipkart.com.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomClass {
	public static WebDriver driver;
	
	public WebDriver getDriver(String url){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\eclipse-java-photon-R-win32-x86_64\\flipkart.com\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
	
	public void setText(WebElement element, String value){
		if(element.isDisplayed() && element.isEnabled()) {
			element.sendKeys(value);
		}
	}
	
	
	public void click(WebElement element) {
		if(element.isDisplayed() && element.isEnabled()) {
			element.click();
		}
	}
	
	public String getParentWindow(){
		String pwd = driver.getWindowHandle();
		return pwd;
	}
	
	public Set<String> getChildWindows(){
		Set<String> cwd = driver.getWindowHandles();
		return cwd;
	}
	
	public void switchToWindow(Set<String> cwd, String pwd) {
		for(String x : cwd) {
			if(!x.equals(pwd)) {
				driver.switchTo().window(x);
				System.out.println(x);
				System.out.println(pwd);
				
			}
		}
	}
	
}
