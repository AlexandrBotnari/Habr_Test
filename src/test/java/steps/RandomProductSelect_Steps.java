package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utlis.Action;
import utlis.Logs;


public class RandomProductSelect_Steps {

    Action action = new Action();


    @And("^\"Menu\" appears$")
    public void MenuAppears() {
        //   Assert.assertTrue(feedbackPage.getFeedbackAssertCheck().isDisplayed());
        Logs.logger.info("Assert verification ");

    }

    @Then("^Selects random category from Menu list$")
    public void SelectRandomCategoryFromMenu() throws InterruptedException {
        action.GetRandomCategory();
    }

    @And("^Category appears$")
    public void CategoryAppears() {

    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() {
        action.GetRandomProduct();


    }
}
