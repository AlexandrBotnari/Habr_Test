package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static browser.Driver.getDriver;

public class MainPage_Steps {



    @Given("^The Andy's pizza main page is displayed$")
    public void theAndySPizzaMainPageIsDisplayed() {
        getDriver().get("https://www.andys.md/en");
        Assert.assertNotNull(getDriver().getTitle());
    }

    @When("^User clicks on <lang> button$")
    public void userClicksOnLangButton() {

    }

}
