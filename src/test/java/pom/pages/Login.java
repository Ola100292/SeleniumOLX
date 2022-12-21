package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    WebDriver driver;
    @FindBy(id ="onetrust-accept-btn-handler")
    WebElement mainBtn;
}
