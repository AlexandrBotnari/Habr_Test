package browser;

import cucumber.api.java.After;
import org.junit.Before;

public class Hooks {
    private PropertyReader propertyReader;

    @Before
    public void startDriver(){
        propertyReader = new PropertyReader();
        Driver.createDriver(DriverType.IE);
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void after() throws Exception {
        Thread.sleep(5000);
        Driver.getDriver().quit();
    }

}
