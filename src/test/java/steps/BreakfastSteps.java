package steps;

import cucumber.api.java.en.Then;
import org.joda.time.LocalTime;
import org.junit.Assert;
import pages.BreakfastPage;
import utils.Logs;

public class BreakfastSteps {

    BreakfastPage breakfastPage = new BreakfastPage();
    String cartStatus = breakfastPage.getCartIndex().getText();


    @Then("^validate time restriction for breakfast$")
    public void validateTimeRestrictionForBreakfast() {
        final LocalTime before = new LocalTime(7, 0, 0, 0);
        final LocalTime after = new LocalTime(11, 0, 0, 0);
        LocalTime currentTime = new LocalTime();
        if(currentTime.isAfter(before) && currentTime.isBefore(after)){
            Assert.assertNotEquals(cartStatus,breakfastPage.getCartIndex().getText());
            Logs.logger.info("Breakfast added to cart at: " + currentTime + "| Allowed time for adding is between: " + before + " and " + after);
        }
        else {
            Assert.assertEquals(cartStatus,breakfastPage.getCartIndex().getText());
            Logs.logger.info("Time restriction - Allowed time for adding is between: " + before + " and " + after);
        }

    }


}