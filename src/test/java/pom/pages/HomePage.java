package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement accCookies;

    public void clickOnCookies() {
        accCookies.click();
    }
}
