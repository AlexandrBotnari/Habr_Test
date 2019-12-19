package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.NewsPage;

import static utlis.screenshots.Screenshots.screenshot;

public class NewsSteps {
    NewsPage newsPage = new NewsPage();

    @Then("^a news is displayed$")
    public void aNewsIsDisplayed() {
        Assert.assertTrue(newsPage.getBackToNews().isDisplayed());
        screenshot("news");

    }
}
