package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import utlis.Action;



import static browser.Driver.getDriver;


@Getter
public class RandomProductSelect_Steps {

    HomePage homePage = new HomePage();
    Action action = new Action();


    @When("^User clicks on \"Menu\" button$")
    public void UserClicksOnMenuButton() {
        homePage.PressMenuButton();
    }

    @And("^\"Menu\" appears$")
    public void MenuAppears(){

    }


    @Then("^Selects random category from \"Menu\" list$")
    public void SelectRandomCategoryFromMenu() throws InterruptedException {
        action.GetRandomCategory();
    }

    @And("^Category appears$")
    public void CategoryAppears(){

    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() throws InterruptedException {
        action.GetRandomProduct();
        Thread.sleep(2000);
        HomePage.CartCounterAssertCheck();

    }
}
