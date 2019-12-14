package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reflectionHelper.Reflection;


import static browser.Driver.getDriver;

public class GeneralSteps {

    Reflection reflection = new Reflection();

    public static String getUrl() {
        return getDriver().getCurrentUrl();
    }

    @Then("^\"([^\"]*)\" page is opened$")
    public void isOpened(String url) {
        //reflection.currentPage(getUrl(),);

    }


    @When("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
