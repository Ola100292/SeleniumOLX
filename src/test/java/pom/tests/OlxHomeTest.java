package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;

public class OlxHomeTest extends TestBase {

    @Test
    public void initScrollDown()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();
        homePage.setFooterMobileBtn();
        homePage.checkPage();
    }
}
