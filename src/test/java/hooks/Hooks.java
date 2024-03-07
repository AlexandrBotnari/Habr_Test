package hooks;

import browser.Driver;
import browser.PropertyReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.Getter;
import utils.Logs;
import utils.screenshots.Screenshots;


@Getter
public class Hooks {

    private PropertyReader propertyReader = new PropertyReader();

    @Before
    public void startDriver(Scenario scenario) {
        Screenshots.setScenario(scenario);
        Driver.getInstance().getDriver().manage().window().maximize();
        Driver.getInstance().getDriver().get(PropertyReader.getProperty("HomePage.url"));
        Logs.logger.info("Start of scenario " + scenario.getName());
    }


    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed())
            Screenshots.screenshot("onFail");

        Driver.getInstance().closeDriver();
        Logs.logger.info("End of Scenario " + scenario.getName());
    }

}
