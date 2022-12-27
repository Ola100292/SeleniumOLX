package pom.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
    static String pathToDrive = "chromedriver.exe";
    protected static WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeAll
    public static void initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", pathToDrive);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.olx.pl/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.pollingEvery((Duration.ofMillis(400)));
        js = (JavascriptExecutor) driver;
    }

    @AfterAll
    public static void driverQuit() {
        driver.quit();
    }
}
