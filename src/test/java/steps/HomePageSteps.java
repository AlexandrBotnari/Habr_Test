package steps;


import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import pageObjects.HeaderMenu;

import static browser.Driver.getDriver;

@Getter
public class HomePageSteps {

    HeaderMenu headerMenu = new HeaderMenu();

    @Then("^current \"(.*)\" field changes to chosen$")
    public void currentLocationFieldChangesToChosen(String location) throws InterruptedException {
        Thread.sleep(4000);

        if (location.equals("chisinau")) {
            location = "210-210";
            Assert.assertTrue(headerMenu.getCityCurrent().getText().toLowerCase().endsWith(location));
        } else

            Assert.assertTrue(headerMenu.getCityCurrent().getText().toLowerCase().startsWith(location));
    }

    @Then("^drop down menu appears$")
    public void dropDownMenuAppears() {
        Assert.assertTrue(headerMenu.getBalti().isEnabled());
        Assert.assertTrue(headerMenu.getChisinau().isEnabled());
    }


    @Then("^page changes language to \"(.*)\"$")
    public void changeLanguageToLanguage(String language) {
        Assert.assertTrue(
                getDriver().getCurrentUrl().endsWith(language.toLowerCase()));
    }


}
