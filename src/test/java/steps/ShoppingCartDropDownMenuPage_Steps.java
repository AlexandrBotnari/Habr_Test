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

ShoppingCartDropDownMenuPage sCDDMP =  new ShoppingCartDropDownMenuPage();
HeaderMenu headerMenu = new HeaderMenu();
    Actions actions = new Actions(getDriver());

    @Given("^any product\\(s\\) are added in basket$")
    public void anyProductSAreAddedInBasket() {
        Assert.assertNotEquals("Your cart is empty",sCDDMP.getShoppingCartDDHeader().getText());
    }

    @When("^user navigate on basket icon$")
    public void userNavigateOnBasketIcon() {

        actions.moveToElement(headerMenu.getShoppingCart());
    }


    @Then("^dropdown menu appears$")
    public void dropdownMenuAppears() {
        Assert.assertTrue(sCDDMP.getOrderButton().isDisplayed());
    }


    
protected int price;
//    @When("^user clicks on \"([^\"]*)\" button$")
//    public void userClicksOnButton(String arg0) throws Throwable {
//    price = Integer.parseInt(sCDDMP.getTotalPrice().getText());
//if(arg0 =="minus")
//   sCDDMP.getShoppingCartDDProductsMinus();
//        throw new PendingException();
//    }

    @Then("^quantity of this product changes to one \"([^\"]*)\"$")
    public void quantityOfThisProductChangesToOne(String arg0) throws Throwable {
Assert.assertNotEquals(price,Integer.parseInt(sCDDMP.getTotalPrice().getText()));
        throw new PendingException();
    }
}
