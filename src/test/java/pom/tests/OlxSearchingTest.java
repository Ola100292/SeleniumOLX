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
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.setMainSearchField("Dom");
        searchPage.setMainCityField();
        String actualCity = searchPage.setChooseRegion();
        String exceptedCity = "Gliwice";
        Assertions.assertEquals(exceptedCity, actualCity);

    }
    @Test
    public void initSearchCars() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.setCarCategory();
        searchPage.setCars();
        ResultPage resultPage = PageFactory.initElements(driver, ResultPage.class);
        resultPage.setSearchInput();
        resultPage.setTechnicalConditionHeading();
        resultPage.setSearchBtn();
        resultPage.checkSearch();
    }

}
