package pom.pages;

import org.junit.jupiter.api.Assertions;
import pom.tests.TestBase;

import java.util.concurrent.TimeUnit;

public class RegionsPage extends TestBase {

    public void checkRegion() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,4500)");
        Boolean city = driver.getPageSource().contains("Gliwice");
        Assertions.assertTrue(city);
    }
}
