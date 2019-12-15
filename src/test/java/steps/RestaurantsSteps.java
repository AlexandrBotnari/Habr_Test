package steps;

import cucumber.api.java.en.Then;
import pageObjects.RestaurantsPage;

public class RestaurantsSteps {
    RestaurantsPage restaurantsPage = new RestaurantsPage();

    @Then("^verify Restaurants list is filtered$")
    public void verifyRestaurantsListIsFiltered() {
        int s1= restaurantsPage.getFilter().size();

    }


}
