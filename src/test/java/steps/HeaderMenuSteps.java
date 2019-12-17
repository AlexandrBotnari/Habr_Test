package steps;

import cucumber.api.java.en.When;
import pageObjects.HeaderMenuPage;

public class HeaderMenuSteps {
 HeaderMenuPage headerMenuPage = new HeaderMenuPage();
    @When("^user clicks on News link$")
    public void userClicksOnNewsLink() {
        headerMenuPage.getNews().click();
    }
}
