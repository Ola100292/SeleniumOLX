package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.tests.TestBase;

import javax.swing.*;
import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    WebElement mainSearchField;
    @FindBy(className = "cityfield")
    WebElement mainCityField;
    @FindBy(className = "a-region-6")
    WebElement chooseRegion;
    @FindBy(css = "[class*='cat-cmt-icon-5']")
    WebElement carCategory;
    @FindBy(css = "[href*='samochody']")
    WebElement cars;

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void setMainSearchField(String searchField) {
        mainSearchField.sendKeys(searchField);
    }

    public void setMainCityField() {
        mainCityField.click();
    }

    public String setChooseRegion() {
        Actions actions = new Actions(driver);
        actions.moveToElement(chooseRegion).perform();
        List<WebElement> listingCount = driver.findElements(By.xpath("//*[@id=\"a-region-6\"]"));
        String actualCity = listingCount.get(13).getDomAttribute("data-name");
        return actualCity;
    }

    public void setCarCategory() {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class*='cat-cmt-icon-5']")));
        carCategory.click();
    }

    public void setCars() {
        wait.until(ExpectedConditions.elementToBeClickable(cars)).click();
    }

}
