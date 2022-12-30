package pom.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.tests.TestBase;

public class HomePage extends BasePage {
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement accCookies;
    @FindBy(css = "[href*='mobilne']")
    WebElement footerMobileBtn;
    @FindBy(css = "[href*='regions']")
    WebElement footerRegionsBtn;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void setAccCookies() {
        accCookies.click();
    }

    public void setFooterMobileBtn() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3500)");
        footerMobileBtn.click();
    }

    public void checkPage() {
        String expectedURL = "https://www.olx.pl/lp/mobilne/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL, actualUrl);
    }

    public void setFooterRegionsBtn() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        footerRegionsBtn.click();
    }
}
