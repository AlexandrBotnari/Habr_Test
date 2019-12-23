package browser;

import lombok.Getter;
import org.openqa.selenium.WebDriver;

public class Driver {

    @Getter
    private WebDriver driver;

    private static Driver instance = null;

    public static Driver getInstance() {
        if(instance == null) {
            instance = new Driver();
        }
        return instance;
    }

    private Driver() {
        driver = createDriver();
    }

    private WebDriver createDriver() {
        String browser = PropertyReader.getProperty("browser").toUpperCase();
        return DriverFactory.instantiateDriver(DriverType.valueOf(browser));
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            instance = null;
        }
    }
}



