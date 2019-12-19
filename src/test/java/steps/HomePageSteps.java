package steps;


import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import pages.HomePage;

import static browser.Driver.getDriver;

@Getter
public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Then("^current \"(.*)\" field changes to chosen$")
    public void currentLocationFieldChangesToChosen(String location) throws InterruptedException {
        Thread.sleep(4000);

        if (location.equals("chisinau")) {
            location = "210-210";
            Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().endsWith(location));
        } else

            Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().startsWith(location));
    }

    @Then("^drop down menu appears$")
    public void dropDownMenuAppears() {
        Assert.assertTrue(homePage.getBalti().isEnabled());
        Assert.assertTrue(homePage.getChisinau().isEnabled());
    }


    @Then("^page changes language to \"(.*)\"$")
    public void changeLanguageToLanguage(String language) {
        Assert.assertTrue(
                getDriver().getCurrentUrl().endsWith(language.toLowerCase()));
    }


}
