package steps;

import browser.Driver;
import browser.DriverType;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.HeaderMenu;

public class LunchMenuAndys_Steps {

  

    @When("^customer tries to add lunch from current day$")
    public void customerTriesToAddLunchFromCurrentDay() {
    }

    @And("^at the available time$")
    public void atTheAvailableTime() {
        
    }

    @Then("^the chosen lunch pack stores in the cart$")
    public void theChosenLunchPackStoresInTheCart() {
    }

    @Then("^\"([^\"]*)\" is opened$")
    public void isOpened(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
