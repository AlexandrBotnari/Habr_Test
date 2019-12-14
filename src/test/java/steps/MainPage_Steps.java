package steps;

import browser.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.HeaderMenu;

public class MainPage_Steps {



    @Given("^The Andy's pizza main page is displayed$")
    public void theAndySPizzaMainPageIsDisplayed() {
        Driver.getDriver().get("https://www.andys.md/en");
        Assert.assertNotNull(Driver.getDriver().getTitle());
    }

    @When("^User clicks on <lang> button$")
    public void userClicksOnLangButton() {

    }

}
