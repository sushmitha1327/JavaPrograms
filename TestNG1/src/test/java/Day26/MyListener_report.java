package Day26;

import org.openqa.selenium.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyListener_report implements ITestListener {

    public static WebDriver driver;  // shared driver
    private ExtentReports extent;
    private ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        System.out.println("⚡ Test Execution Started...");

        String reportPath = System.getProperty("user.dir") + "/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("WebOrders Test Report");
        spark.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        // system info
        extent.setSystemInfo("Tester", "Sushmitha");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("OS", System.getProperty("os.name"));
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("▶ Starting Test: " + result.getName());
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✅ Test Passed: " + result.getName());
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ Test Failed: " + result.getName());
        test.log(Status.FAIL, result.getThrowable());

        if (driver != null) {
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "Screenshot_" + result.getName() + "_" + timeStamp + ".png";

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(System.getProperty("user.dir") + "/Screenshots/" + fileName);

            destFile.getParentFile().mkdirs(); // create folder if not exists
            try {
                Files.copy(srcFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                test.addScreenCaptureFromPath(destFile.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⏭️ Test Skipped: " + result.getName());
        test.log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("📄 Test Execution Finished...");
        if (extent != null) {
            extent.flush();
        }
    }
}
