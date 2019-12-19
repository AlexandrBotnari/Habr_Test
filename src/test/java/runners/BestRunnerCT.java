package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber/cucumber.json"},
        glue = {"classpath:steps","classpath:hooks"},
        tags = "@ChangeCityAB",

        snippets = SnippetType.CAMELCASE
)

public class BestRunnerCT {
    //  If you are not Alex, go f... out of here
    //  Keep your tiny dirty hands out of this code
}
