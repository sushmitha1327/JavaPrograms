package Day26;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class MyListener implements ITestListener {

    WebDriver driver;

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Testing starts...");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Name of Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✅ Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ Test Failed: " + result.getName());

        // Get driver instance
        Object testClass = result.getInstance();
        driver = ((Listener_Practice) testClass).driver;

        // Save screenshot
        File destDir = new File("Screenshots");
        if (!destDir.exists()) destDir.mkdir();

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String fileName = result.getName() + "_" + timeStamp + ".png";

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(destDir, fileName);

        try {
            Files.copy(srcFile, destFile); // ✅ Correct usage with Guava
            System.out.println("Screenshot saved: " + destFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⏭️ Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Timeout: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Testing Ended...");
    }
}
