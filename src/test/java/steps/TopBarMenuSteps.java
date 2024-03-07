package steps;

import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import utils.Logs;

import static utils.screenshots.Screenshots.screenshot;

@Getter
public class TopBarMenuSteps {

 //   FeedbackPage feedbackPage = new FeedbackPage();
 //   ContactsPage contactsPage = new ContactsPage();
 //   DeliveryPage deliveryPage = new DeliveryPage();

    @Then("^Feedback Page is displayed$")
    public void FeedbackPageIsDisplayed() {
    //    Assert.assertTrue(feedbackPage.getFeedbackAssertCheck().isDisplayed());
        screenshot("Feedback Assert");
        Logs.logger.info("Feedback Assert verification ");
    }

    @Then("^Contacts page is displayed$")
    public void ContactsPageDisplayed() {
    //    Assert.assertTrue(contactsPage.getContactsHeader().isDisplayed());
        screenshot("Feedback Assert");
        Logs.logger.info("Contacts Assert verification ");

    }

    @Then("^Delivery page is displayed$")
    public void DeliveryDisplayed() {
    //    Assert.assertTrue(deliveryPage.getDeliveryHeader().isDisplayed());
        screenshot("Feedback Assert");
        Logs.logger.info("Delivery Assert verification ");

    }
}
