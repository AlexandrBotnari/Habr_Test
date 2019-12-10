package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static browser.PropertyReader.getProperty;

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



