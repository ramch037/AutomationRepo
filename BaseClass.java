package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PropertiesUtil;

public class BaseClass {

    protected static WebDriver driver;

    // Setup method to initialize WebDriver
    @Before()
    public static void setUp() {
        String browser = PropertiesUtil.getBrowser();
        String url = PropertiesUtil.getUrl();

        // Check browser property and initialize corresponding WebDriver
        if (browser != null && !browser.isEmpty()) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    System.err.println("Unsupported browser! Please check the 'driver' property in the configuration file.");
                    return;
            }
        } else {
            System.err.println("Browser not specified! Please check the 'driver' property in the configuration file.");
            return;
        }

        // Setup WebDriver properties
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the URL
        if (url != null && !url.isEmpty()) {
            driver.get(url);
        } else {
            System.err.println("URL not specified! Please check the 'url' property in the configuration file.");
        }
    }

    // Tear down method to quit the driver
    @After()
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
