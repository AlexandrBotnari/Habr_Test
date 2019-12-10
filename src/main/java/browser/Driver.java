package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.FIREFOX;


public class Driver {

    public static org.openqa.selenium.WebDriver driver = null;
    private static Properties properties = null;


    static {
        try {
            properties = new Properties();
            properties.load(Driver.class.getClassLoader().getResourceAsStream("application.properties"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key, "");
    }


    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;

    }

     }


