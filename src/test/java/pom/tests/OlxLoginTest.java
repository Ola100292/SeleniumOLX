package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.HomePage;
import pom.pages.LoginPage;

public class OlxLoginTest extends TestBase {

    @Test
    public void initLogIn() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.setAccCookies();
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickOnMainLoggingBt();
        loginPage.setLogin("kontotestowe12345@o2.pl");
        loginPage.setPassword("Qazwsx12#");
        loginPage.clickOnLoginBt();
        loginPage.checkSearchResult();
    }
}
