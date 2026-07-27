package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class HomePage {
	WebDriver driver;
	WaitUtils waitUtils;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		waitUtils=new WaitUtils(driver);
	}
	
	By searchBox=By.xpath("//input[@placeholder='search delicious food...']");
	By addQty = By.cssSelector("[data-testid='increase-quantity-btn']");
	By addToCart = By.cssSelector("[data-testid='add-to-cart-btn']");
	By pizzaCard = By.xpath("//h2[contains(text(),'Pizza')]");
	By cartCount=By.xpath("//span[contains(@class, 'absolute') and number(text()) > 0]");
	
	// Search food
    public void searchFood(String food) {
        waitUtils.waitForVisible(searchBox).clear();
        waitUtils.waitForVisible(searchBox).sendKeys(food);
        waitUtils.waitForVisible(pizzaCard);
    }

    // Increase quantity (optional)
    public void increaseQuantity() {
        waitUtils.waitForClickable(addQty).click();
    }

    // Add item to cart
    public void clickAddToCart() {
        waitUtils.waitForClickable(addToCart).click();
    }

    // Verify cart count
    public boolean isItemAddedToCart() {
        return waitUtils.waitForVisible(cartCount).isDisplayed();
    }
}
