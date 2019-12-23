package steps;

import browser.Driver;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ToppingMenuPage;


public class ToppingMenuSteps {
    ToppingMenuPage toppingMenuPage = new ToppingMenuPage();
    WebDriverWait wait = new WebDriverWait(Driver.getInstance().getDriver(), 5);

    @Then("^Topping Menu is opened$")
    public void toppingMenuIsOpened() {
        wait.until(ExpectedConditions.visibilityOf(toppingMenuPage.getToppingMenu()));
        Assert.assertTrue(toppingMenuPage.getToppingMenu().isEnabled());

    }

}

