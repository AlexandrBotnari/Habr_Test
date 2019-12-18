package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import lombok.Getter;
import org.junit.Assert;
import pageObjects.ContactsPage;
import pageObjects.DeliveryPage;
import pageObjects.FeedbackPage;
import pageObjects.HomePage;

@Getter
public class TopBarMenu_Steps {

    FeedbackPage feedbackPage = new FeedbackPage();
    ContactsPage contactsPage = new ContactsPage();
    DeliveryPage deliveryPage = new DeliveryPage();

    @Then("^Feedback Page is displayed$")
    public void FeedbackPageIsDisplayed() {
        Assert.assertTrue(feedbackPage.getFeedbackAssertCheck().isDisplayed());
        Hooks.logger.info("Assert verification ");
    }

    @Then("^Contacts page is displayed$")
    public void ContactsPageDisplayed() {
        Assert.assertTrue(contactsPage.getContactsHeader().isDisplayed());
        Hooks.logger.info("Assert verification ");

    }

    @Then("^Delivery page is displayed$")
    public void DeliveryDisplayed() {
        Assert.assertTrue(deliveryPage.getDeliveryHeader().isDisplayed());
        Hooks.logger.info("Assert verification ");

    }
}
