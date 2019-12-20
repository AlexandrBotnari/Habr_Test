package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.NewsPage;
import utlis.Logs;

import static utlis.screenshots.Screenshots.screenshot;

public class NewsSteps {
    NewsPage newsPage = new NewsPage();

    @Then("^a news is displayed$")
    public void aNewsIsDisplayed() {
        Logs.logger.info("The news is opened");
        Assert.assertTrue(newsPage.getBackToNews().isDisplayed());
        screenshot("news");

    }
}
