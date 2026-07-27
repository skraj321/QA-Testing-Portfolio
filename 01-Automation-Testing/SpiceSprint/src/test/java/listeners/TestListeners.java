package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;
import utilities.ScUtils;

public class TestListeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        try {

            BaseClass base = (BaseClass) result.getInstance();

            ScUtils.captureScreenshot(base.getDriver(), result.getName());

            System.out.println("Screenshot captured successfully.");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}