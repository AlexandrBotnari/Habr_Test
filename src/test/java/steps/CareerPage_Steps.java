package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utlis.Action;

public class CareerPage_Steps {
    Action action = new Action();


    @And("^fills in info$")
    public void ClicksOnRandomCheckboxes() throws InterruptedException {
        action.EnterDataInRandomField();

    }

    @Then("^Checkboxes React on clicks$")
    public void CheckboxesReactOnClicks(){

    }

    @And("^clicks on random restaurant Checkboxes$")
    public void RestaurantJobList() throws InterruptedException {
        action.RestaurantJobsListRandom();

    }

    @And("^clicks on random factory Checkboxes$")
    public void FactoryJobList() throws InterruptedException {
        action.FactoryJobsListRandom();

    }

    @And("^clicks on random checkboxes on the page$")
    public void CheckboxesRandom() throws InterruptedException {
        action.RandomCheckBoxesList();

    }


}
