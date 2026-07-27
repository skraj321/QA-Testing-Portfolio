package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class ForgotPass {
	WebDriver driver;
	WaitUtils waitUtils;
	public ForgotPass(WebDriver driver) {
		this.driver=driver;
		waitUtils = new WaitUtils(driver);
	}
	
	By forgotBtn = By.xpath("//div[text()='Forgot Password']");
	By enterField = By.xpath("//input[@type='email' and @required]");
	By sendOtp = By.xpath("//button[text()='Send Otp']");
	By enterOtp = By.xpath("//input[@placeholder='Enter OTP']");
	By verify = By.xpath("//button[text()='Verify']");
	By enterNewPass = By.xpath("//input[@placeholder='Enter new password']");
	By confirmPass = By.xpath("//input[@placeholder='Confirm password']");
	By resetPass = By.xpath("//button[text()='Reset Password']");
	
	public void forgetBtn() {
		waitUtils.waitForVisible(forgotBtn).click();
	}
	public void enterRegisteredEmail(String email) {
		waitUtils.waitForVisible(enterField).sendKeys(email);
	}
	public void sendOtpBtn() {
		waitUtils.waitForClickable(sendOtp).click();
	}
	public void waitForManualOtp() throws InterruptedException {
	    Thread.sleep(20000); //wait for manual otp
	}
	public void clickVerify() {
		waitUtils.waitForClickable(verify).click();
	}
	public void enterNewPass(String newPass, String conPass) {
		waitUtils.waitForVisible(enterNewPass).sendKeys(newPass);
		waitUtils.waitForVisible(confirmPass).sendKeys(conPass);
	}
	public void changePass() {
		waitUtils.waitForClickable(resetPass).click();
	}
}
