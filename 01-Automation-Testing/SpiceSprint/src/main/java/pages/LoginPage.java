package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class LoginPage {
	WebDriver driver;
	WaitUtils waitUtils;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		waitUtils = new WaitUtils(driver);
	}
	By enterEmail = By.name("email");
	By enterPassword = By.name("password");
	By signInBtn = By.xpath("//button[text()='SignIn Now']");
	
	public void login(String email, String pass) {
		waitUtils.waitForVisible(enterEmail).sendKeys(email);
		waitUtils.waitForVisible(enterPassword).sendKeys(pass);
		waitUtils.waitForClickable(signInBtn).click();
	}
}
