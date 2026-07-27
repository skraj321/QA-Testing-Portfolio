package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;
import utilities.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        try {

            BaseClass base = (BaseClass) result.getInstance();

            ScreenshotUtils.captureScreenshot(base.getDriver(), result.getName());

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}