package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.CartPage;
import utils.Action;
import utils.Logs;

import static utils.screenshots.Screenshots.screenshot;

public class CheckProductInCartSteps {

    Action action = new Action();
    CartPage cartPage = new CartPage();


    @And("^Random product added to cart$")
    public void RandomProductAddedToCart() {
        action.GetRandomCategory();
        action.GetRandomProduct();
        Logs.logger.info("Adds random product to cart");
    }

    @Then("^Removes one product from cart$")
    public void RemovesOneProductFromCart() {
        action.RemoveRandomFromCart();
        screenshot("Removes product from cart");
        Logs.logger.info("Removes product from cart ");

    }

    @And("^Check that product where removed$")
    public void CheckThatProductRemoved() {
        Assert.assertTrue(cartPage.getInformativeMessage().isDisplayed());
        screenshot("Informative message is displayed");
        Logs.logger.info("Informative message is displayed ");

    }

}
