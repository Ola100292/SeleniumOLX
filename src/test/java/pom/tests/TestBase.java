package pom.tests;

import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestBase {

    public static WebDriver driver = null;
    static String pathToDrive = "chromedriver.exe";

    @BeforeAll
    public static void initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", pathToDrive);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.olx.pl/");

    }
}
