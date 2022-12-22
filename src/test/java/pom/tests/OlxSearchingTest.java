package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.SearchPage;

public class OlxSearchingTest extends TestBase {
    @Test
    public void initSearchHouses()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCookies();

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.setMainSearchField("Dom");
        searchPage.setMainCityField();
    }

}
