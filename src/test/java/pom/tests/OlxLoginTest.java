package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.LoginPage;

public class OlxLoginTest extends TestBase {

    @Test
    public void initLogIn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setAccCookies();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnMainLoggingBt();
        loginPage.setLogin("kontotestowe12345@o2.pl");
        loginPage.setPassword("Qazwsx12#");
        loginPage.clickOnLoginBt();
        loginPage.checkSearchResult();
    }
}
