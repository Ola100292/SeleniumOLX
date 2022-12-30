package pom.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestBase {

    WebDriver driver;
    String pathToDrive = "chromedriver.exe";
    WebDriverWait wait;


    @BeforeAll
    public void initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", pathToDrive);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.olx.pl/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.pollingEvery((Duration.ofMillis(400)));

    }

    @AfterAll
    public void driverQuit() {
        driver.quit();
    }
}
