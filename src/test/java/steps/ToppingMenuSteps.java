package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.ToppingMenuPage;

public class ToppingMenuSteps {
    ToppingMenuPage toppingMenuPage = new ToppingMenuPage();
    @Then("^Topping Menu is opened$")
    public void toppingMenuIsOpened() {
        Assert.assertTrue(toppingMenuPage.getToppingMenu().isDisplayed());
    }
///// пока не нужно
//    @Then("^verify topping is added$")
//    public boolean verifyToppingIsAdded() {
//        String i = toppingMenuPage.getNumber().getText();
//        if (i =="1"){
//            return true;
//
//        }
//        else return false;
//
//    }
//
//    @Then("^verify topping is removed$")
//    public boolean verifyToppingIsRemoved() {
//        String i = toppingMenuPage.getNumber().getText();
//        if (i =="0"){
//            return true;
//
//        }
//        else return false;
//
//    }
    }

