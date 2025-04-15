package kodilla.testing2.facebook;

import kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//div[@role='button'" +
            " and @aria-label='Zezwól na wszystkie pliki cookie' and @tabindex='0']";
    public static final String XPATH_NEW_ACCOUNT = "//*[@data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_DOB_DAY = "//*[@aria-label='Dzień']";
    public static final String XPATH_DOB_MONTH = "//*[@aria-label='Miesiąc']";
    public static final String XPATH_DOB_YEAR = "//*[@aria-label='Rok']";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig  .getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();

        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();

        WebElement dobDay = driver.findElement(By.xpath(XPATH_DOB_DAY));
        Select dobDaySelect = new Select(dobDay);
        dobDaySelect.selectByValue("24");
        WebElement dobMonth = driver.findElement(By.xpath(XPATH_DOB_MONTH));
        Select dobMonthSelect = new Select(dobMonth);
        dobMonthSelect.selectByValue("6");
        WebElement dobYear = driver.findElement(By.xpath(XPATH_DOB_YEAR));
        Select dobYearSelect = new Select(dobYear);
        dobYearSelect.selectByValue("2008");
    }
}
