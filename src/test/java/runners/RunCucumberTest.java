package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = {"classpath:steps", "classpath:hooks"},
        tags ="@DemoRun"


)

public class RunCucumberTest {
}
