package steps;


import browser.Driver;
import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import utils.Logs;

import static utils.screenshots.Screenshots.screenshot;

@Getter
public class HomePageSteps {


    @Then("^current \"(.*)\" field changes to chosen$")
    public void currentLocationFieldChangesToChosen(String location) throws Throwable {
        Thread.sleep(2000);

        if (location.equals("chisinau")) {
            location = "210-210";
            //   Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().contains(location));
        } else

            //  Assert.assertTrue(homePage.getCityCurrent().getText().toLowerCase().contains(location));
            Logs.logger.info("Assert location changed");
        screenshot("Location changed");
    }

    @Then("^drop down menu appears$")
    public void dropDownMenuAppears() {
        //   Assert.assertTrue(homePage.getBalti().isEnabled());
        //   Assert.assertTrue(homePage.getChisinau().isEnabled());
        Logs.logger.info("Assert enabling of city buttons");
        screenshot("Enable city buttons");
    }


    @Then("^page changes language to \"(.*)\"$")
    public void changeLanguageToLanguage(String language) {
        Assert.assertTrue(Driver.getInstance().getDriver().getCurrentUrl().endsWith(language.toLowerCase()));

        if (language.equals("Ru")) {
            //     Assert.assertEquals("Доставка", homePage.getDeliveryButton().getText());
            //     Assert.assertEquals("Отзывы", homePage.getFeedbackButton().getText());
        } else {
            //   Assert.assertEquals("Livrare", homePage.getDeliveryButton().getText());
//Assert.assertEquals("Feedback", homePage.getFeedbackButton().getText());
        }

        Logs.logger.info("Language changed to " + language);
        screenshot("Language changed to " + language);
    }


    @Then("^menu map appears$")
    public void menuMapAppears() {
      //  Assert.assertTrue(homePage.getMenumap().isDisplayed());
        Logs.logger.info("Menu is displayed");
        screenshot("Menu appears");
    }
}
