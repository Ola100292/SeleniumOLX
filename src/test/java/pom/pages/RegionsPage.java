package pom.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.tests.TestBase;

import java.util.concurrent.TimeUnit;

public class RegionsPage extends BasePage {
    public RegionsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void checkRegion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,4500)");
        Boolean city = driver.getPageSource().contains("Gliwice");
        Assertions.assertTrue(city);
    }
}
