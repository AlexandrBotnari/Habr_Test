package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utlis.Action;
import utlis.Logs;

import static utlis.screenshots.Screenshots.screenshot;

public class RandomProductSelect_Steps {

    Action action = new Action();
    HomePage homePage = new HomePage();

    @And("^Menu appears$")
    public void MenuAppears() throws InterruptedException {
        Assert.assertTrue(homePage.getMenu().isDisplayed());
        Thread.sleep(3000);
        screenshot("Menu");
            Logs.logger.info("Assert verification ");

    }

    @Then("^Selects random category from Menu list$")
    public void SelectRandomCategoryFromMenu() throws InterruptedException {
        action.GetRandomCategory();
        screenshot("Catogory");
    }

    @And("^Category appears$")
    public void CategoryAppears() {

    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() {
        action.GetRandomProduct();
        screenshot("add a random product");

    }
}
