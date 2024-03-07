package steps;

import browser.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Action;

import java.time.Duration;


public class ToppingMenuSteps {
 //   PizzaPage toppingMenuPage = new PizzaPage();

    WebDriverWait wait = new WebDriverWait(Driver.getInstance().getDriver(), Duration.ofSeconds(5));
    Action action = new Action();

    @Then("^Topping Menu is opened$")
    public void toppingMenuIsOpened() {
    //    wait.until(ExpectedConditions.visibilityOf(toppingMenuPage.getToppingMenu()));
    //    Assert.assertTrue(toppingMenuPage.getToppingMenu().isEnabled());

    }


 /*   @When("^user looks for pizza with available toppings$")
    public void userLooksForPizzaWithAvailableToppings() throws InterruptedException {
        action.GetRandomProductPhoto();
Thread.sleep(1000);
     /*   while (!toppingMenuPage.getToppingTabs().isDisplayed()) {
            toppingMenuPage.close();
            action.GetRandomProductPhoto();
        }

    }

    @Then("^choose pizza that has toppings$")
    public void choosePizzaThatHasToppings() {
        Assert.assertNotNull(toppingMenuPage.getToppingMenu());
    } */
}

