package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static browser.PropertyReader.getProperty;

public class DriverFactory {

    private static final String CHROME_PATH = "chrome.path";
    private static final String FF_PATH = "FF.path";
    private static final String CHROMEDRIVER_EXE = "webdriver.chrome.driver";
    private static final String FF_EXE = "webdriver.gecko.driver";

    public static WebDriver instantiateDriver(DriverType driverName) {
        switch (driverName) {
            case CHROME:
                System.setProperty(CHROMEDRIVER_EXE, getProperty(CHROME_PATH));
                return new ChromeDriver();
            case FF:
                System.setProperty(FF_EXE, getProperty(FF_PATH));
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Unexpected value: " + driverName);
        }

    }
}
