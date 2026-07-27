package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import listeners.TestListeners;
import pages.CheckOut;
import pages.HomePage;
import pages.LoginPage;

@Listeners(TestListeners.class)
public class HomeTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	CheckOut cp;
	@BeforeMethod
	public void setup() {
		launchBrowser();
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
		cp=new CheckOut(driver);
	}
	@Test(enabled=false)
	public void addToCArtTest() throws InterruptedException {
		lp.login("sk9128050035@gmail.com", "Sah@12");
		Thread.sleep(3000);
		hp.searchFood("pizza");
		Thread.sleep(3000);
		hp.increaseQuantity();
		Thread.sleep(3000);
		hp.clickAddToCart();
		
		
		Assert.assertTrue(hp.isItemAddedToCart());
	}
	@Test
	public void checkoutTest() throws InterruptedException {

		lp.login("sk9128050035@gmail.com", "Sah@12");
		Thread.sleep(3000);
		hp.searchFood("pizza");
		Thread.sleep(3000);
		hp.increaseQuantity();
		Thread.sleep(3000);
		hp.clickAddToCart();
		
		Assert.assertTrue(hp.isItemAddedToCart());

	    cp.openCart();
	    cp.proceedToCheckout();
	    cp.placeOrder();

	    Assert.assertTrue(cp.isOrderPlaced());
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		closeBrowser();
	}
	
}
