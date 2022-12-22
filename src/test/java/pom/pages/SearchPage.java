package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pom.tests.TestBase;

import javax.swing.*;

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
    //od tego momentu nie skonczone, cala ponizsza metoda, chyba musi byc zwracana lista ??
    public void setChooseRegion()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(chooseRegion).perform();

    }



}
