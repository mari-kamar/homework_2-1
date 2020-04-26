import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverFactory {

    public WebDriver create(String browser, String options) {
        return create(browser);
    }

    public WebDriver create(String browser) {

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            throw new IllegalStateException("browser name must be specified");
        }

    }
}
