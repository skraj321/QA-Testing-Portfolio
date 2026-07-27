package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class HomePage {

    WebDriver driver;
    WaitUtils waitUtils;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    By close = By.xpath("//span[@data-cy='closeModal']");
    By roundTrip = By.xpath("//li[@data-cy='roundTrip']");
    By sourceCity = By.id("fromCity");
    By fromSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
    By destCity = By.id("toCity");
    By toSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
    By searchBtn = By.cssSelector("a.widgetSearchBtn");

    public void closePopUp() {
    	try {

            waitUtils.waitForClickable(close).click();
            System.out.println("Popup closed");

        } catch (Exception e) {

            System.out.println("Popup not displayed");

        }
    }

    public void activatePage() {
    	 driver.findElement(By.tagName("body")).click();
    	    waitUtils.waitForClickable(sourceCity);
    }

    public void clickRoundTripBtn() {
        waitUtils.waitForClickable(roundTrip).click();
    }

    public void enterFromCity(String fromCity) {

        waitUtils.waitForClickable(sourceCity).click();

        waitUtils.waitForVisible(fromSearchBox).sendKeys(fromCity);

        waitUtils.waitForClickable(
                By.xpath("//span[text()='" + fromCity + "']")
        ).click();
    }

    public void enterToCity(String toCity) {

        waitUtils.waitForClickable(destCity).click();

        waitUtils.waitForVisible(toSearchBox).sendKeys(toCity);

        waitUtils.waitForClickable(
                By.xpath("//span[text()='" + toCity + "']")
        ).click();
    }

    public void departDate() {

        waitUtils.waitForClickable(
                By.xpath("//div[@aria-label='Thu Aug 20 2026']")
        ).click();
    }

    public void returnDate() {

        waitUtils.waitForClickable(
                By.xpath("//div[@aria-label='Thu Aug 27 2026']")
        ).click();
    }

    public void searchBtn() {

        waitUtils.waitForClickable(searchBtn).click();
    }
}