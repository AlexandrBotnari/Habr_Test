package steps;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.joda.time.LocalTime;
import org.junit.Assert;
import pages.AbstractPage;
import pages.LunchPage;
import utlis.Logs;

public class LunchMenuSteps extends AbstractPage {
    LunchPage lunchPage = new LunchPage();
    String cartStatus = lunchPage.getCartIndex().getText();

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/14";
        return url;
    }



    @Then("^validate time restriction$")
    public void validateTimeRestriction() throws InterruptedException {
        final LocalTime before = new LocalTime(12, 0, 0, 0);
        final LocalTime after = new LocalTime(15, 0, 0, 0);
        LocalTime currentTime = new LocalTime();
        if(currentTime.isAfter(before) && currentTime.isBefore(after)){
            Thread.sleep(3100);
            Assert.assertNotEquals(cartStatus,lunchPage.getCartIndex().getText());
            Logs.logger.info("Lunch added to cart at: " + currentTime + "| Allowed time for adding is between: " + before + " and " + after);
        }
        else {
            Assert.assertEquals(cartStatus,lunchPage.getCartIndex().getText());
            Logs.logger.info("Time restriction - Allowed time for adding is between: " + before + " and " + after);
        }
    }
}
