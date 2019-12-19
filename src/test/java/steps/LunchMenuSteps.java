package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.joda.time.LocalTime;
import org.junit.Assert;
import pageObjects.AbstractPage;
import pageObjects.LunchPage;

public class LunchMenuSteps extends AbstractPage {
    LunchPage lunchPage = new LunchPage();

     @And("^time is between 12:00 and 15:00$")
    public void timeIsBetween() {

        final LocalTime before = new LocalTime(12, 0, 0, 0);
        final LocalTime after = new LocalTime(15, 0, 0, 0);
        LocalTime currentTime = new LocalTime();

        Assert.assertTrue("It is not time yet",currentTime.isAfter(before) && currentTime.isBefore(after));

    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/14";
        return url;
    }


    @Then("^lunch adds to cart$")
    public void lunchAddsToCart() {

         Assert.assertNotNull(lunchPage.getOrderButton());
    }

    @Then("^button lights with yellow color$")
    public void buttonLightsWithYellowColor() {
         Assert.assertNotNull(lunchPage.getBuyProductLunch());
    }
}
