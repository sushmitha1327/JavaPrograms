package Day26;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners (Day26.MyListener_report.class)  // ✅ Correct placement
public class Listener_Practice {
    public WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // ✅ PASS Case
    public void logIn() {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_username")))
            .sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = driver.getTitle();
        Assert.assertEquals(title, "Web Orders", "Login Failed!");
    }

    // ❌ FAIL Case
    public void checkTitleName() {
        String expectedName = "Invalid Title";   // intentionally wrong
        String actualName = driver.getTitle();
        Assert.assertEquals(actualName, expectedName, "Title mismatch - This will FAIL");
    }

    // ⏭️ SKIP Case
    public void skipTestExample() {
        System.out.println("This test will be skipped intentionally.");
        throw new SkipException("Skipping this test for demo purposes.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
