package steps;

import cucumber.api.java.en.Then;
import lombok.Getter;
import org.junit.Assert;
import pageObjects.ContactsPage;
import pageObjects.DeliveryPage;
import pageObjects.FeedbackPage;
import utlis.Logs;

@Getter
public class TopBarMenu_Steps {

    FeedbackPage feedbackPage = new FeedbackPage();
    ContactsPage contactsPage = new ContactsPage();
    DeliveryPage deliveryPage = new DeliveryPage();

    @Then("^Feedback Page is displayed$")
    public void FeedbackPageIsDisplayed() {
        Assert.assertTrue(feedbackPage.getFeedbackAssertCheck().isDisplayed());
        Logs.logger.info("Assert verification ");
    }

    @Then("^Contacts page is displayed$")
    public void ContactsPageDisplayed() {
        Assert.assertTrue(contactsPage.getContactsHeader().isDisplayed());
        Logs.logger.info("Assert verification ");

    }

    @Then("^Delivery page is displayed$")
    public void DeliveryDisplayed() {
        Assert.assertTrue(deliveryPage.getDeliveryHeader().isDisplayed());
        Logs.logger.info("Assert verification ");

    }
}
