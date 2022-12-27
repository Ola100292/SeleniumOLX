package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.RegionsPage;

public class OlxHomeTest extends TestBase {

    @Test
    public void initScrollDown()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();
        homePage.setFooterMobileBtn();
        homePage.checkPage();
    }
    @Test
    public void initScrollDownRegions()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();
        homePage.setFooterRegionsBtn();
        RegionsPage regionsPage = PageFactory.initElements(driver, RegionsPage.class);
        regionsPage.checkRegion();
    }
}
