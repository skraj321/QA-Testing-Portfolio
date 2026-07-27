package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.ScreenshotUtils;

import base.BaseClass;
import pages.HomePage;

import listeners.TestListener;

@Listeners(TestListener.class)
public class HomeTest extends BaseClass {

    HomePage home;

    @BeforeTest
    public void setup() {

        launchBrowser();
        home = new HomePage(driver);

    }

    @Test
    public void searchFlightTickets() throws InterruptedException, IOException {

        home.closePopUp();
        home.activatePage();
        home.clickRoundTripBtn();
        home.enterFromCity("Patna, India");
        home.enterToCity("Bengaluru, India");
        home.departDate();
        home.returnDate();
        home.searchBtn();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertTrue(driver.getCurrentUrl().contains("flight/search"));

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
    	Thread.sleep(5000);
        closeBrowser();

    }

}