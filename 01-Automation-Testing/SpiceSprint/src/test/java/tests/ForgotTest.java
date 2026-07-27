package tests;

import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import listeners.TestListeners;
import pages.ForgotPass;


@Listeners(TestListeners.class)

public class ForgotTest extends BaseClass{
	ForgotPass fp;
	
	@BeforeTest
	public void setup() {
		launchBrowser();
		fp=new ForgotPass(driver);
	}
	
	@Test
	public void forgotPassMethod() throws InterruptedException {
		fp.forgetBtn();
		fp.enterRegisteredEmail("sk9128050035@gmail.com");
		fp.sendOtpBtn();
		fp.waitForManualOtp();
		fp.clickVerify();
		fp.enterNewPass("Sah@12", "Sah@12");
		fp.changePass();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

		Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		
		closeBrowser();
	}
}
