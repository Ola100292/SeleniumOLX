import org.junit.jupiter.api.AfterEach;
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
        driver.get("https://www.olx.pl/");
    }
}
