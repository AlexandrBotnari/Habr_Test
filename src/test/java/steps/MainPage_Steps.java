package steps;


import Context.Keys;
import Context.ScenarioContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.AbstractPage;
import pageObjects.HeaderMenu;
import utlis.reflectionHelper.Reflection;

import static browser.Driver.getDriver;

public class MainPage_Steps {

    HeaderMenu headerMenu = new HeaderMenu();

    @Given("^The Andy's pizza main page is displayed$")
    public void theAndySPizzaMainPageIsDisplayed() {

        Assert.assertNotNull(getDriver().getTitle());

        Assert.assertNotNull(getDriver().getTitle());
        System.out.println(getDriver().getTitle());
    }


    //Move to generic

//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(headerMenu.getCityCurrent()).perform();



    @Then("^current \"(.*)\" field changes to chosen$")
    public void currentLocationFieldChangesToChosen(String location) {
        Assert.assertEquals(location,headerMenu.getCityCurrent().getText());
    }

    @Then("^drop down menu appears$")
    public void dropDownMenuAppears() {

        Assert.assertTrue(headerMenu.getBaltiCity().isEnabled());
        Assert.assertTrue(headerMenu.getChisinauCity().isEnabled());

    }

//    @When("^user click on  ([^\"]*)$")
//    public void userClickOnLocation(String city) throws InterruptedException {
//        Actions actions= new Actions(getDriver());
//        actions.moveToElement(headerMenu.getCityCurrent());
//        Thread.sleep(2000);
//        if(city == "Chisinau")
//            headerMenu.getChisinauCity().click();
//        else
//            headerMenu.getBaltiCity().click();
//    }




    @Then("^page changes language to \"([^\"]*)\"$")
    public void changeLanguageToLanguage(String language) {
Assert.assertTrue(
        getDriver().getCurrentUrl().endsWith(language));
    }



}
