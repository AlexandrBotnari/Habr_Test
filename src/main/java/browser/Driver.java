package browser;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;

    private Driver() {
    }

    private static WebDriver createDriver() {
        String browser = PropertyReader.getProperty("browser").toUpperCase();
        return DriverFactory.instantiateDriver(DriverType.valueOf(browser));
    }

    public static WebDriver getDriver() {
        if (driver == null)
            driver = createDriver();
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}



