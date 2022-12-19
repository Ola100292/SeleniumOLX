
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Search {

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

    @Test
    public void searchHousesSilesia() //find by xpatch and className
    {
        driver.navigate().to("https://www.olx.pl/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement searchFieldByXpath = driver.findElement(By.xpath("//*[@id=\"headerSearch\"]"));
        searchFieldByXpath.sendKeys("Dom");
        WebElement searchFieldByClass = driver.findElement(By.className("cityfield"));
        searchFieldByClass.click();
        //instantiate an Actions class for mouse
        Actions actions = new Actions(driver);
        //argument for moveToElement()
        WebElement chooseRegion = driver.findElement(By.className("a-region-6"));
        //Move Mouse Action
        actions.moveToElement(chooseRegion).perform();
        driver.findElement(By.xpath("//*[@id=\"a-region-6\"]"));
        List<WebElement> listingCount = driver.findElements(By.xpath("//*[@id=\"a-region-6\"]"));
        String actualCity = listingCount.get(13).getDomAttribute("data-name");
        String exceptedCity = "Gliwice";
        Assertions.assertEquals(exceptedCity, actualCity);

    }

    @Test
    public void searchCars()  {
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // check for condition
        wait.pollingEvery((Duration.ofMillis(250)));
        driver.navigate().to("https://www.olx.pl/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class*='cat-cmt-icon-5']")));
        driver.findElement(By.cssSelector("[class*='cat-cmt-icon-5']")).click();
        //wait for element after click
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[href*='samochody']")))).click();
        //wait for page to load completely
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("searchBtn")));
        WebElement searchCar = driver.findElement(By.xpath("//*[@id=\"search\"]"));

        wait.until((ExpectedConditions.elementToBeClickable(searchCar)));

        searchCar.sendKeys("Toyota Yaris");
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[1]/div/div[14]/div/div")))).click();


    }

}
