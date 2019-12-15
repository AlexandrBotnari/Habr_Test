package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import utlis.Action;

public class CheckProductInCart_Steps {
    HomePage homePage = new HomePage();
    Action action = new Action();


    @When("^User opens product cart page$")
    public void UserOpensProductCartPage() {
        homePage.PressCartButton();

    }

    @Then("^Removes one product from cart$")
    public void RemovesOneProductFromCart() throws InterruptedException {
        action.RemoveRandomFromCart();

    }

    @And("^Check that product where removed$")
    public void CheckThatProductRemoved(){

    }

}
