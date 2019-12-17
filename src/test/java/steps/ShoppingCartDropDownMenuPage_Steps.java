package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pageObjects.HeaderMenu;
import pageObjects.ShoppingCartDropDownMenuPage;

import static browser.Driver.getDriver;

public class ShoppingCartDropDownMenuPage_Steps {

    protected int price;
    ShoppingCartDropDownMenuPage sCDDMP = new ShoppingCartDropDownMenuPage();
    HeaderMenu headerMenu = new HeaderMenu();
    Actions actions = new Actions(getDriver());

    @Given("^any product are added in basket$")
    public void anyProductSAreAddedInBasket() {


     //   Assert.assertEquals("Your cart is empty", sCDDMP.getShoppingCartDDHeader().getText());
    }

    @When("^user navigate on basket icon$")
    public void userNavigateOnBasketIcon() {

        actions.moveToElement(headerMenu.getShoppingCart());
    }

    @Then("^dropdown menu appears$")
    public void dropdownMenuAppears() {
        Assert.assertTrue(sCDDMP.getOrderButton().isDisplayed());
    }

    @When("^user clicks on \"minus\" button$")
    public void userClicksOnButtonmin() throws Throwable {
        price = Integer.parseInt(sCDDMP.getTotalPrice().getText());
        sCDDMP.getShoppingCartDDProductsMinus().click();
        throw new PendingException();
    }

    @Then("^quantity of this product changes to one \"less\"$")
    public void quantityOfThisProductChangesToOne(String arg0) throws Throwable {
        Assert.assertEquals(price, Integer.parseInt(sCDDMP.getTotalPrice().getText()) - 1);
        throw new PendingException();
    }


    @When("^user clicks on \"plus\" button$")
    public void userClicksOnButtonplu() throws Throwable {
        price = Integer.parseInt(sCDDMP.getTotalPrice().getText());
        sCDDMP.getShoppingCartDDProductsPlus().click();
        throw new PendingException();
    }
    @Then("^quantity of this product changes to one \"more\"$")
    public void quantityOfThisProductChangesToOne() throws Throwable {
        Assert.assertEquals(price, Integer.parseInt(sCDDMP.getTotalPrice().getText()) + 1);
        throw new PendingException();
    }
}

