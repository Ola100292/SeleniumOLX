package pom.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.ResultPage;
import pom.pages.SearchPage;

public class OlxSearchingTest extends TestBase {
    @Test
    public void initSearchHouses() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.setAccCookies();
        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.setMainSearchField("Dom");
        searchPage.setMainCityField();
        String actualCity = searchPage.setChooseRegion();
        String exceptedCity = "Gliwice";
        Assertions.assertEquals(exceptedCity, actualCity);

    }

    @Test
    public void initSearchCars() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.setAccCookies();
        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.setCarCategory();
        searchPage.setCars();
        ResultPage resultPage = new ResultPage(driver, wait);
        resultPage.setSearchInput();
        resultPage.setTechnicalConditionHeading();
        resultPage.setSearchBtn();
        resultPage.checkSearch();
    }

}
