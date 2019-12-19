package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import org.apache.log4j.Logger;
import pageObjects.HomePage;
import utlis.Action;

public class ProductPreview_Steps {


    Action action = new Action();




    @And("^Selects random category from Menu$")
    public void SelectRandomCategoryFromMenu() {
        action.GetRandomCategory();

    }

    @Then("^User click on random product image in order to open preview$")
    public void UserClicksOnRandomImage() {
        action.GetRandomProductPhoto();


    }
}
