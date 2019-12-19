package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.BreakfastPage;

import static utlis.screenshots.Screenshots.screenshot;

public class BreakfastSteps {

    BreakfastPage breakfastPage = new BreakfastPage();

    @Then("^warning message \"([^\"]*)\" is displayed$")
    public boolean warningMessageIsDisplayed(String message) {
        Assert.assertTrue(breakfastPage.getWarMes().isEnabled());
        if (message == breakfastPage.getMessage()) {
            screenshot("warning message");
            return true;
        } else {
            screenshot("warning message");
            return false;
        }
    }


}