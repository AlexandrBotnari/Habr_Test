package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import utlis.Action;

public class CheckProductInCart_Steps {

    HomePage homePage = new HomePage();
    Action action = new Action();


    @And("^Random product added to cart$")
    public void RandomProductAddedToCart() {
        action.GetRandomCategory();
        action.GetRandomProduct();
    }

    @Then("^Removes one product from cart$")
    public void RemovesOneProductFromCart() {
        action.RemoveRandomFromCart();
    }

    @And("^Check that product where removed$")
    public void CheckThatProductRemoved(){

    }

}
