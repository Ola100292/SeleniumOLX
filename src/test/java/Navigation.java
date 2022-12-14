import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    WebDriver driver;

    @BeforeEach
    public void chromeDriverSetup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a.sus\\IdeaProjects\\SeleniumOLX\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterEach
    public void driverQuit()
    {
        driver.quit();
    }


    @Test
    public void open()
    {
        driver.navigate().to("https://www.olx.pl/");
        driver.get("https://www.onet.pl/");
        driver.navigate().back();;
        String olxTitle = "Ogloszenia - Sprzedam, kupie na OLX.pl";
        Assertions.assertEquals(olxTitle, driver.getTitle(), "The title of the page is not: " + olxTitle);
    }
}
