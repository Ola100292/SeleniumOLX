package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    WebDriver driver;
    @FindBy(id ="onetrust-accept-btn-handler")
    WebElement accCookies;
    @FindBy(css = "#topLoginLink > span")
    WebElement mainLoggingBt;
    @FindBy(className = "css-1c0rtj6")
    WebElement login;
    @FindBy(className = "css-1q8s32c")
    WebElement password;
    @FindBy(className = "css-ohaivz-BaseStyles")
    WebElement loginBtn;
}
