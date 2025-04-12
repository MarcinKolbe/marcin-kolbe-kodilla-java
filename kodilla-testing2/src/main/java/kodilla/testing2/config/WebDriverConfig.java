package kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverConfig {
    public static final String EDGE = "EDGE_DRIVER";
    public static final String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.edge.driver", "C:\\Selenium-drivers\\Edge\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(EDGE)) {
            return new EdgeDriver();
        } else if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
