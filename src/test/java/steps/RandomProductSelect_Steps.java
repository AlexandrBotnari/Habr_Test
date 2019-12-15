package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.MenuPage;

import static browser.Driver.getDriver;
import static pageObjects.HomePage.PressMenuButton;
import static pageObjects.MenuPage.GetRandomCategory;
import static pageObjects.MenuPage.GetRandomProduct;

@Getter
public class RandomProductSelect_Steps {

    HomePage homePage = new HomePage();
    MenuPage menuPage = new MenuPage();


    @When("^User clicks on \"([^\"]*)\" button$")
    public void UserClicksOnMenuButton() {
        PressMenuButton();

    }

    @And("^Selects random category from \"([^\"]*)\" list$")
    public void SelectRandomCategoryFromMenu() {
        GetRandomCategory();
    }

    @Then("^User adds random product from category to cart$")
    public void SelectRandomProduct() throws InterruptedException {
        GetRandomProduct();
        Thread.sleep(2000);
        HomePage.CartCounterAssertCheck();

    }
}
