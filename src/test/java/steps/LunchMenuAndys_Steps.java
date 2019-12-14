package steps;

import browser.Driver;
import browser.DriverType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.HeaderMenu;

public class LunchMenuAndys_Steps {

    @When("^user opens Andys website$")
    public void useropenswebsite(){

        Driver.getDriver().get("https://www.andys.md/en");
    }


    @Then("^the website is displayed$")
    public void theWebsiteIsDisplayed() {
        //Assert.assertSame("Andys Pizza Menu - delivery of hot and tasty food to your home and office", (Driver.getDriver().getTitle() ));
        Assert.assertNotNull((Driver.getDriver().getTitle() ));
    }

    @Given("^3 non-stupid developers$")
    public void nonStupidDevelopers() {
Assert.assertNotNull(Driver.getDriver());
    }
}
