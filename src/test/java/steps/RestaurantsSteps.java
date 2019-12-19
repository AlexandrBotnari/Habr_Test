package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.RestaurantsPage;
import utlis.Action;

public class RestaurantsSteps {
    RestaurantsPage restaurantsPage = new RestaurantsPage();
    Action action = new Action();
    int number;

    @Then("^verify Restaurants list is filtered$")
    public boolean verifyRestaurantsListIsFiltered() {
        int s1 = 0;
        for (WebElement rest : restaurantsPage.getRestaurantsList()) {
            if (rest.isDisplayed()) {
                s1 += 1;
            }
        }
        if (number >= s1) {
            return true;
        }
        return false;

    }


    @When("^user selects random a filter$")
    public void userSelectsRandomAFilter() {
        number = restaurantsPage.getRestaurantsList().size();
        action.GetRandomFilter();
    }


}
