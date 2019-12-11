package hooks;

import browser.Driver;
import browser.DriverType;
import browser.PropertyReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private PropertyReader propertyReader;

    @Before

    public void startDriver() throws Exception {
        propertyReader = new PropertyReader();
        Driver.createDriver(DriverType.CHROME);
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void after() throws Exception {
        Driver.getDriver().quit();
    }

}
