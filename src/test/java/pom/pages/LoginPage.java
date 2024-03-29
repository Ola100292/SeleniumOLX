package pom.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.tests.TestBase;

public class LoginPage extends BasePage {

    @FindBy(css = "#topLoginLink > span")
    WebElement mainLoggingBt;
    @FindBy(className = "css-1c0rtj6")
    WebElement login;
    @FindBy(className = "css-1q8s32c")
    WebElement password;
    @FindBy(className = "css-ohaivz-BaseStyles")
    WebElement loginBtn;
    @FindBy(className = "css-12nnhr7")
    WebElement waitCondition;
    @FindBy(className = "css-rdovvl")
    WebElement checkCondition;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickOnMainLoggingBt() {
        mainLoggingBt.click();
    }

    public void setLogin(String strLogin) {
        wait.until(ExpectedConditions.visibilityOf(waitCondition));
        login.sendKeys(strLogin);
    }

    public void setPassword(String strPass) {
        password.sendKeys(strPass);
    }

    public void clickOnLoginBt() {
        loginBtn.click();
    }

    public void checkSearchResult() {
        wait.until(ExpectedConditions.visibilityOf(checkCondition));
        Boolean display = checkCondition.isDisplayed();
        Assertions.assertTrue(display);
    }
}
