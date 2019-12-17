package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.NewsPage;

public class NewsSteps {
    NewsPage newsPage = new NewsPage();

    @Then("^a news is displayed$")
    public void aNewsIsDisplayed() {
        newsPage.getBackToNews().isDisplayed();

    }
}
