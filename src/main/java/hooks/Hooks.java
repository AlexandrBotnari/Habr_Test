package hooks;

import browser.Driver;
import browser.DriverType;
import browser.PropertyReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {
    private PropertyReader propertyReader;


    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    public static Logger logger = Logger.getLogger(Hooks.class);
    private Scenario currentScenario;

    @Before
    public void startDriver(Scenario scenario) {
        currentScenario = scenario;
        propertyReader = new PropertyReader();
        Driver.createDriver(DriverType.CHROME);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.andys.md/en");
        logger.info("Start of scenario " + currentScenario.getName());
    }


    @After
    public void after() {
        Driver.getDriver().quit();
        logger.info("End of Scenario " + currentScenario.getName());
    }

}
