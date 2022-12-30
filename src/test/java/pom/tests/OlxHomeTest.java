package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.RegionsPage;

public class OlxHomeTest extends TestBase {

    @Test
    public void initScrollDown() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.setAccCookies();
        homePage.setFooterMobileBtn();
        homePage.checkPage();
    }

    @Test
    public void initScrollDownRegions() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.setAccCookies();
        homePage.setFooterRegionsBtn();
        RegionsPage regionsPage = new RegionsPage(driver, wait);
        regionsPage.checkRegion();
    }
}
