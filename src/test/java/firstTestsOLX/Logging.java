package firstTestsOLX;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logging {
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
    public void logging() {

        driver.navigate().to("https://www.olx.pl/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.pollingEvery((Duration.ofMillis(400)));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("#topLoginLink > span")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-12nnhr7")));
        WebElement login = driver.findElement(By.className("css-1c0rtj6"));
        login.click();
        login.sendKeys("kontotestowe12345@o2.pl");
        WebElement password = driver.findElement(By.className("css-1q8s32c"));
        password.click();
        password.sendKeys("Qazwsx12#");
        driver.findElement(By.className("css-ohaivz-BaseStyles")).click();

    }
}
