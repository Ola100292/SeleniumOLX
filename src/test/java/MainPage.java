import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
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
    public void Footer() {
        driver.navigate().to("https://www.olx.pl/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        //WebElement element = driver.findElement(By.cssSelector("[href*='mobline']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down
        js.executeScript("window.scrollBy(0,3500)");
        WebElement element = driver.findElement(By.cssSelector("[href*='mobilne']"));
        element.click();
        String expectedURL= "https://www.olx.pl/lp/mobilne/";
        String actualUrl= driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL,actualUrl);

    }
}
