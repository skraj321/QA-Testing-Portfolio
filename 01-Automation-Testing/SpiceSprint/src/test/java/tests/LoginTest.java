package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import listeners.TestListeners;
import org.testng.annotations.Listeners;
import base.BaseClass;
import pages.LoginPage;

@Listeners(TestListeners.class)
public class LoginTest extends BaseClass {
	LoginPage lp;
	
	@BeforeTest
	public void setup() {
		launchBrowser();
		lp = new LoginPage(driver);
	}
	
	
	@Test
	public void loginTestMethod() {
		//login page calling
		lp.login("sk@gmail.com","Sah14");
		By myOrders = By.xpath("//*[contains(text(),'My Orders')]");
		System.out.println(driver.findElement(myOrders).getText());
		Assert.assertTrue(driver.findElement(myOrders).isDisplayed());
	}
	 
	
	
	@AfterTest
	public void closeBrowserMethod() throws InterruptedException {
		Thread.sleep(5000);
		closeBrowser();
	}
}
