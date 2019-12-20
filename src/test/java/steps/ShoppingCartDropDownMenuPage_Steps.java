package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import pages.HomePage;
import pages.ShoppingCartDropDownMenuPage;
import utlis.Logs;

import static browser.Driver.getDriver;
import static utlis.screenshots.Screenshots.screenshot;

public class ShoppingCartDropDownMenuPage_Steps {

    protected int quantity;
    ShoppingCartDropDownMenuPage sCDDMP = new ShoppingCartDropDownMenuPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(getDriver());
    CartPage cartPage = new CartPage();

    @Given("^any product are added in basket$")
    public void anyProductSAreAddedInBasket() throws InterruptedException {

        homePage.getMenu().click();
        homePage.getSpecials().click();
        homePage.getSnackToVodka().click();
        homePage.getBack().click();
        Logs.logger.info("Adding of any product in cart");
        screenshot("Cart has product");
    }


    @Then("^dropdown cart menu appears$")
    public void dropdownMenuCartAppears() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(sCDDMP.getOrderButton().isDisplayed());
        quantity = Integer.parseInt(sCDDMP.getQuantitty().getText());
        Logs.logger.info("Assert dropdown cart has appeared");
        screenshot("dropdown cart has appeared");
    }


    @Then("^quantity of this product changes to one less$")
    public void quantityOfThisProductChangesToOneLess() throws Throwable {
        Thread.sleep(1000);
        int currentQuantity = Integer.parseInt(cartPage.getQuantitty().getAttribute("innerHTML"));
        quantity = quantity - 1;
        Assert.assertEquals(quantity, currentQuantity);
Logs.logger.info("The product quantity changed");
        screenshot("The product quantity changed");
    }


    @Then("^quantity of this product changes to one more$")
    public void quantityOfThisProductChangesToOneMore() throws Throwable {
        int currentQuantity = Integer.parseInt(cartPage.getQuantitty().getAttribute("innerHTML"));
        quantity = quantity + 1;
        Assert.assertEquals(quantity, currentQuantity);
        Logs.logger.info("The product quantity changed");
        screenshot("The product quantity changed");
    }
}

