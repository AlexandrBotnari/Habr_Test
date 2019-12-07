package Browser;

import org.openqa.selenium.WebDriver;


public class DriverManager {
    private static WebDriver driver;



    public static WebDriver getDriver() {

        if (driver == null) {
            throw new RuntimeException("Not yet created driver");

        }
        return driver;
    }

    public static void createDriver(DriverType driverType) {
        if (driver == null) {
            driver = DriverFactory.driverFactory(driverType);
            return;
        }
        if (driverType.equals(DriverFactory.getCurrentType()))
            return;

        else {
            closeDriver();
            driver = DriverFactory.driverFactory(driverType);
        }


    }


    public static void closeDriver() {
        driver.quit();
        driver = null;
    }


}

