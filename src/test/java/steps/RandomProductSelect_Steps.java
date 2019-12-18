package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import utlis.Action;


public class RandomProductSelect_Steps {


    HomePage homePage = new HomePage();
    Action action = new Action();


    @And("^\"Menu\" appears$")
    public void MenuAppears() {

    }

    @Then("^Selects random category from Menu list$")
    public void SelectRandomCategoryFromMenu() throws InterruptedException {
        action.GetRandomCategory();
    }

    @And("^Category appears$")
    public void CategoryAppears() {

    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() throws InterruptedException {
        action.GetRandomProduct();
        Thread.sleep(2000);
        //    HomePage.CartCounterAssertCheck();

    }
}
