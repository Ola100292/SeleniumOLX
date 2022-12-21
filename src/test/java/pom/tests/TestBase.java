package pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver initChromeDriver(String pathToDrive) {
        System.setProperty("webdriver.chrome.driver", pathToDrive);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
