package flipkart.flipkart.com.testscript;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import flipkart.com.base.CustomClass;
import flipkart.flipkart.com.pom.CartPage;
import flipkart.flipkart.com.pom.HomePage;
import flipkart.flipkart.com.pom.PhoneListPage;
import flipkart.flipkart.com.pom.ProductPage;
import junit.framework.Assert;

public class TestScript extends CustomClass {
	public static CustomClass c = new CustomClass();

	@BeforeClass
	public void launchBrowser() {
		WebDriver driver = c.getDriver("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage h = new HomePage();
		c.click(h.getClosebtn());
	}

	@Test
	public void testcase1() {
		HomePage h = new HomePage();
		c.setText(h.getSearchbox(), "Iphone");
		c.click(h.getSearchbtn());
		PhoneListPage p = new PhoneListPage();
		List<WebElement> phonelist = p.getPhonelist();
		for (WebElement x : phonelist) {
			System.out.println(x.getText());
		}
		Random r = new Random();
		int r1 = r.nextInt(phonelist.size());
		c.click(phonelist.get(r1));
		String pwd = c.getParentWindow();
		Set<String> cwd = c.getChildWindows();
		c.switchToWindow(cwd, pwd);
		ProductPage pr = new ProductPage();
		String exp = pr.getExpphone().getText();
		c.click(pr.getCartbtn());
		CartPage cp = new CartPage();
		String act = cp.getActphone().getText();
		Assert.assertEquals(exp, act);
	}

	@Test
	public void testcase2() {
		HomePage h = new HomePage();
		c.setText(h.getSearchbox(), "Iphone");
		c.click(h.getSearchbtn());
		PhoneListPage p = new PhoneListPage();
		c.click(p.getL2h());
		List<WebElement> pricelist2 = p.getPricelist();
		List<String> act = new ArrayList<String>();
		for (WebElement x : pricelist2) {
			String text = x.getText();
			act.add(text);
		}
		for(int i=0; i<act.size();i++) {
			for(int j=i+1; j<act.size();j++) {
				String s = act.get(i);
				s = s.replaceAll("[^0-9]","");
				int a1 = Integer.parseInt(s);
				String r = act.get(j);
				r = r.replaceAll("[^0-9]","");
				int a2 = Integer.parseInt(r);
				Assert.assertTrue(a1<=a2);
			}
		}
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
