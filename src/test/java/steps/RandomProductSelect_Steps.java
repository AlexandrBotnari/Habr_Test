package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import utlis.Actions;
import utlis.RandomListSelect;

import static browser.Driver.getDriver;


@Getter
public class RandomProductSelect_Steps {

    HomePage homePage = new HomePage();
    Actions actions = new Actions();


    @When("^User clicks on \"Menu\" button$")
    public void UserClicksOnMenuButton() {
        homePage.PressMenuButton();

    }

    @And("^Selects random category from \"Menu\" list$")
    public void SelectRandomCategoryFromMenu() throws InterruptedException {
        actions.GetRandomCategory();
    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() throws InterruptedException {
        actions.GetRandomProduct();
        Thread.sleep(2000);
        HomePage.CartCounterAssertCheck();

    }
}
