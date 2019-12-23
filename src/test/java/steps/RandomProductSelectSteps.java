package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utlis.Action;
import utlis.Logs;

import static utlis.screenshots.Screenshots.screenshot;

public class RandomProductSelectSteps {

    Action action = new Action();
    HomePage homePage = new HomePage();


    @And("^Menu appears$")
    public void MenuAppears() {
        Assert.assertTrue(homePage.getMenu().isDisplayed());
        screenshot("Menu");
        Logs.logger.info("Assert verification ");

    }

    @Then("^Selects random category from Menu list$")
    public void SelectRandomCategoryFromMenu() {
        action.GetRandomCategory();
        screenshot("Category");
    }


    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() {
        action.GetRandomProduct();
        screenshot("add a random product");

    }
}
