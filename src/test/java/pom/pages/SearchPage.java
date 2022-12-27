package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pom.tests.TestBase;

import javax.swing.*;
import java.util.List;

public class SearchPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"headerSearch\"]")
    WebElement mainSearchField;
    @FindBy(className = "cityfield")
    WebElement mainCityField;
    @FindBy(className = "a-region-6")
    WebElement chooseRegion;


    public void setMainSearchField(String searchField)
    {
        mainSearchField.sendKeys(searchField);
    }
    public void setMainCityField()
    {
        mainCityField.click();
    }
    public String setChooseRegion()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(chooseRegion).perform();
        List<WebElement> listingCount = driver.findElements(By.xpath("//*[@id=\"a-region-6\"]"));
        String actualCity = listingCount.get(13).getDomAttribute("data-name");
        return actualCity;
    }



}
