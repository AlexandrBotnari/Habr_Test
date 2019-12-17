package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static browser.PropertyReader.getProperty;

public class DriverFactory {

    private static final String CHROME_PATH = "chrome.path";
    private static final String IE_PATH = "IE.path";
    private static final String CHROMEDRIVER_EXE = "webdriver.chrome.driver";
    private static final String IE_EXE = "webdriver.ie.driver";

    public static WebDriver instantiateDriver(DriverType driverName) {
        switch (driverName) {
            case CHROME:
                System.setProperty(CHROMEDRIVER_EXE, getProperty(CHROME_PATH));
                return new ChromeDriver();
            case IE:
                System.setProperty(IE_EXE, getProperty(IE_PATH));

                InternetExplorerOptions options = new InternetExplorerOptions();

                options.ignoreZoomSettings();
                return new InternetExplorerDriver(options);
            default:
                throw new RuntimeException("Unexpected value: " + driverName);
        }

    }
}
