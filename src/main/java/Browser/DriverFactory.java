package Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static DriverType currentType;

    public static WebDriver driverFactory(DriverType driverType) {
        if (driverType.equals(DriverType.CHROME)) {
            return openChrome();
        }
        if (driverType.equals(DriverType.HEADLESS)) {
            currentType = DriverType.HEADLESS;
            return openHeadless();
        } else
            throw new RuntimeException("UNKNOWN DRIVER TYPE");


    }

    public static DriverType getCurrentType() {
        return currentType;
    }

    private static WebDriver openHeadless() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        return new org.openqa.selenium.chrome.ChromeDriver(options);
    }

    private static WebDriver openChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        return new org.openqa.selenium.chrome.ChromeDriver();

    }

}
