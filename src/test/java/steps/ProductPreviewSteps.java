package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utlis.Action;
import utlis.Logs;

import static utlis.screenshots.Screenshots.screenshot;

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
