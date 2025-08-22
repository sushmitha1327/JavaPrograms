package Day27;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SyncException {
    private static final Logger logger = LoggerFactory.getLogger(SyncException.class);

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        logger.info("Launching the browser and navigating to WebOrders site");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }

    @Test
    public void testLogin() {
        try {
            logger.info("Entering username");
            WebElement username = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_username")));
            username.sendKeys("Tester");

            logger.info("Entering password");
            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");

            logger.info("Clicking Login button");
            WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
            loginBtn.click();

            logger.info("Checking if Web Orders page is displayed");
            WebElement logoutLink = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_logout")));
            Assert.assertTrue(logoutLink.isDisplayed(), "Login failed!");
            System.out.println("Login successful, Logout link found!");
            logger.info("Login successful!");

        } catch (NoSuchElementException e) {
            logger.error("Element not found: {}", e.getMessage());
            Assert.fail("Test failed due to missing element.");
        } catch (TimeoutException e) {
            logger.error("Timeout while waiting: {}", e.getMessage());
            Assert.fail("Test failed due to timeout.");
        } catch (Exception e) {
            logger.error("Unexpected error: {}", e.getMessage());
            Assert.fail("Test failed due to unexpected exception.");
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            logger.info("Closing the browser");
            driver.quit();
        }
    }
}
