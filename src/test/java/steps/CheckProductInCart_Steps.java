package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import utlis.Action;

public class CheckProductInCart_Steps {

    HomePage homePage = new HomePage();
    Action action = new Action();



    @And("^Random product added to cart$")
    public void RandomProductAddedToCart() throws InterruptedException {
        action.GetRandomCategory();
        Thread.sleep(2000);
        action.GetRandomProduct();
    }

    @Then("^Removes one product from cart$")
    public void RemovesOneProductFromCart() throws InterruptedException {
        Thread.sleep(2000);
        action.RemoveRandomFromCart();
    }

    @And("^Check that product where removed$")
    public void CheckThatProductRemoved(){

    }

}
