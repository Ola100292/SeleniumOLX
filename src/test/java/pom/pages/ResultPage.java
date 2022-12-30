package pom.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.tests.TestBase;

public class ResultPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchInput;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[1]/div/div[14]/div/div")
    WebElement technicalConditionHeading;
    @FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[1]/div/div[14]/div/div/div[2]/div/div[2]/label")
    WebElement undamagedOption;
    @FindBy(name = "searchBtn")
    WebElement searchBtn;

    public ResultPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void setSearchInput() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("searchBtn")));
        wait.until((ExpectedConditions.elementToBeClickable(searchInput)));
        searchInput.sendKeys("Toyota Yaris");
    }

    public void setTechnicalConditionHeading() {
        wait.until(ExpectedConditions.elementToBeClickable(technicalConditionHeading)).click();
        wait.until(ExpectedConditions.visibilityOf(undamagedOption)).click();
    }

    public void setSearchBtn() {
        searchBtn.click();
    }

    public void checkSearch() {
        boolean checkSearch = driver.getPageSource().contains("Toyota");
        Assertions.assertTrue(checkSearch);
    }
}
