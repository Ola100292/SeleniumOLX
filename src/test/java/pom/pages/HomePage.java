package pom.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pom.tests.TestBase;

public class HomePage extends TestBase {
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement accCookies;
    @FindBy(css = "[href*='mobilne']")
    WebElement footerMobileBtn;

    public void setAccCookies() {
        accCookies.click();
    }

    public void setFooterMobileBtn() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)");
        footerMobileBtn.click();
    }

    public void checkPage() {
        String expectedURL = "https://www.olx.pl/lp/mobilne/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL, actualUrl);
    }
}
