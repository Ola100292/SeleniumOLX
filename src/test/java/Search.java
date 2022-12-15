
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Search {

    WebDriver driver;
    @BeforeEach
    public void chromeDriverSetup()
    {
        driver = SeleniumTestUtils.initChromeDriver("chromedriver.exe");
    }
    @AfterEach
    public void driverQuit()
    {
        driver.quit();
    }

    @Test
    public void searchHouses()   //find by id
    {
        //navigation to page
        driver.navigate().to("https://www.olx.pl/");
        //accepting cookies
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        //main search
        WebElement searchFieldById = driver.findElement(By.id("headerSearch"));
        //type a text in search
        searchFieldById.sendKeys("Dom");
        //search
        driver.findElement(By.id("submit-searchmain")).click();
        String exceptedUrl = "https://www.olx.pl/d/oferty/q-Dom/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(exceptedUrl, actualUrl);

    }
}
