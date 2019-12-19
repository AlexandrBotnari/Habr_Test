package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pageObjects.CartPage;
import pageObjects.HeaderMenu;
import pageObjects.HomePage;
import pageObjects.ShoppingCartDropDownMenuPage;

import static browser.Driver.getDriver;

public class ShoppingCartDropDownMenuPage_Steps {

    protected int quantity;
    ShoppingCartDropDownMenuPage sCDDMP = new ShoppingCartDropDownMenuPage();
    HeaderMenu headerMenu = new HeaderMenu();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(getDriver());
    CartPage cartPage = new CartPage();

    @Given("^any product are added in basket$")
    public void anyProductSAreAddedInBasket() throws InterruptedException {

        homePage.getMenuButton().click();
        Thread.sleep(2000);
        homePage.getSpecials().click();
        homePage.getSnackToVodka().click();
        homePage.getBack().click();


    }


    @Then("^dropdown cart menu appears$")
    public void dropdownMenuCartAppears() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(sCDDMP.getOrderButton().isDisplayed());
        quantity = Integer.parseInt(sCDDMP.getQuantitty().getText());
    }


    @Then("^quantity of this product changes to one less$")
    public void quantityOfThisProductChangesToOneLess() throws Throwable {
        Thread.sleep(1000);
        int currentQuantity = Integer.parseInt(cartPage.getQuantitty().getAttribute("innerHTML"));
        quantity = quantity - 1;
        Assert.assertEquals(quantity, currentQuantity);


    }


    @Then("^quantity of this product changes to one more$")
    public void quantityOfThisProductChangesToOneMore() throws Throwable {
        int currentQuantity = Integer.parseInt(cartPage.getQuantitty().getAttribute("innerHTML"));
        quantity = quantity + 1;
        Assert.assertEquals(quantity, currentQuantity);

    }
}

