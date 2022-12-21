package firstTestsOLX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestUtils {

    public static WebDriver initChromeDriver(String pathToDrive) {
        System.setProperty("webdriver.chrome.driver", pathToDrive);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
