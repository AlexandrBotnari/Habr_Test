package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.Action;
import utils.Logs;

import static utils.screenshots.Screenshots.screenshot;

public class ProductPreviewSteps {


    Action action = new Action();


    @And("^Selects random category from Menu$")
    public void SelectRandomCategoryFromMenu() {
        action.GetRandomCategory();
        screenshot("Selects random category");
        Logs.logger.info("Selects random category ");

    }

    @Then("^User click on random product image in order to open preview$")
    public void UserClicksOnRandomImage() {
        action.GetRandomProductPhoto();
        screenshot("Selects random product photo ");
        Logs.logger.info("Selects random product photo ");


    }
}
