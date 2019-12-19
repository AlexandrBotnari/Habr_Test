package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ToppingMenuPage;

import static browser.Driver.getDriver;

public class ToppingMenuSteps {
    ToppingMenuPage toppingMenuPage = new ToppingMenuPage();
    WebDriverWait wait = new WebDriverWait(getDriver(), 5);

    @Then("^Topping Menu is opened$")
    public void toppingMenuIsOpened() {
        wait.until(ExpectedConditions.visibilityOf(toppingMenuPage.getToppingMenu()));
        Assert.assertTrue(toppingMenuPage.getToppingMenu().isEnabled());

    }

}

