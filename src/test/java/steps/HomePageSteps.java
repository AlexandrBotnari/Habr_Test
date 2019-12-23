package steps;


import browser.Driver;
import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import pages.HomePage;
import utlis.Logs;


import static utlis.screenshots.Screenshots.screenshot;

@Getter
public class HomePageSteps {

    HomePage homePage = new HomePage();


    @Then("^current \"(.*)\" field changes to chosen$")
    public void currentLocationFieldChangesToChosen(String location) throws Throwable {
        Thread.sleep(2000);

        if (location.equals("chisinau")) {
            location = "210-210";
            Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().contains(location));
        } else

            Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().contains(location));
        Logs.logger.info("Assert location changed");
        screenshot("Location changed");
    }

    @Then("^drop down menu appears$")
    public void dropDownMenuAppears() {
        Assert.assertTrue(homePage.getBalti().isEnabled());
        Assert.assertTrue(homePage.getChisinau().isEnabled());
        Logs.logger.info("Assert enabling of city buttons");
        screenshot("Enable city buttons");
    }


    @Then("^page changes language to \"(.*)\"$")
    public void changeLanguageToLanguage(String language) throws Throwable {
        Assert.assertTrue(Driver.getInstance().getDriver().getCurrentUrl().endsWith(language.toLowerCase()));

        Logs.logger.info("Assert language has changes (by url)");
        screenshot("language changet to"+ language);
    }


    @Then("^menu map appears$")
    public void menuMapAppears() {
        Assert.assertTrue(homePage.getMenumap().isDisplayed());
        Logs.logger.info("Menu is displayed");
        screenshot("Menu appears");
    }
}
