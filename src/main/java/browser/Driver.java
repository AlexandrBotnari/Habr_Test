package browser;

import org.openqa.selenium.WebDriver;

public class Driver {


    private static PropertyReader propertyReader;
    private static WebDriver driver;

   public static void createDriver(DriverType driverType){
       driver = DriverFactory.instantiateDriver(driverType);
   }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }
}



