package firstTestsOLX;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Navigation {
    WebDriver driver;

    @BeforeEach
    public void chromeDriverSetup() {
        driver = SeleniumTestUtils.initChromeDriver("chromedriver.exe");
    }

    @AfterEach
    public void driverQuit() {
        driver.quit();
    }

    @Test
    public void open() {
        driver.navigate().to("https://www.olx.pl/");
        driver.get("https://www.onet.pl/");
        driver.navigate().back();
        String olxTitle = "Ogłoszenia - Sprzedam, kupię na OLX.pl";
        Assertions.assertEquals(olxTitle, driver.getTitle(), "The title of the page is not: " + olxTitle);
    }
}