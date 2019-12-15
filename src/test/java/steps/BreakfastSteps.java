package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pageObjects.BreakfactPage;

public class BreakfastSteps {

    BreakfactPage breakfactPage = new BreakfactPage();
    @Then("^warning message \"([^\"]*)\" is displayed$")
    public boolean warningMessageIsDisplayed(String message) {
        if(message == breakfactPage.getMessage()){
            return true;
        }
        else return false;
    }
}