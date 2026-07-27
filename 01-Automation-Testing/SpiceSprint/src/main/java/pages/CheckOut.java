package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class CheckOut {
	WebDriver driver;
	WaitUtils waitUtils;
	public CheckOut(WebDriver driver) {
		this.driver=driver;
		waitUtils = new WaitUtils(driver);
	}
	By cartIcon = By.cssSelector("[data-testid='open cart']");
	By proceedPmt = By.xpath("//button[text()='Proceed to CheckOut']");
	By placeOrd = By.xpath("//button[text()='Place Order']");
	By checkIsOrdered = By.xpath("//button[text()='Back to my Orders']");
	
	public void openCart() {
        waitUtils.waitForClickable(cartIcon).click();
    }

    // Proceed to Checkout
    public void proceedToCheckout() {
        waitUtils.waitForClickable(proceedPmt).click();
    }

    // Place Order
    public void placeOrder() {
        waitUtils.waitForClickable(placeOrd).click();
    }

    // Verify successful order
    public boolean isOrderPlaced() {
        return waitUtils.waitForVisible(checkIsOrdered).isDisplayed();
    }

}
