import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
    @Test
    public void chromeDriverProperty()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a.sus\\IdeaProjects\\SeleniumOLX\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
