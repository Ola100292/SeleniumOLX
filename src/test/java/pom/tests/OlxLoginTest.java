package pom.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pom.pages.Login;

public class OlxLoginTest extends TestBase {

    @Test
    public void init()
    {
        Login login = PageFactory.initElements(driver, Login.class);
        login.clickOnCookies();
        login.clickOnMainLoggingBt();
        login.setLogin("kontotestowe12345@o2.pl");
        login.setPassword("Qazwsx12#");
        login.clickOnLoginBt();

    }
}
