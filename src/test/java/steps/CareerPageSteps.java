package steps;

import cucumber.api.java.en.And;
import utlis.Action;
import utlis.Logs;

import static utlis.screenshots.Screenshots.screenshot;

public class CareerPageSteps {
    Action action = new Action();


    @And("^fills in data$")
    public void EnterRandomData() {
        action.EnterDataInRandomField();
        screenshot("Enters Data");
        Logs.logger.info("Enters Data ");


    }


    @And("^clicks on random restaurant Checkboxes$")
    public void RestaurantJobList() {
        action.RestaurantJobsListRandom();
        screenshot("Restaurant Job List checkboxes");
        Logs.logger.info("clicks on Restaurant Job List checkbox ");

    }

    @And("^clicks on random factory Checkboxes$")
    public void FactoryJobList() {
        action.FactoryJobsListRandom();
        screenshot("Factory Job List checkboxes");
        Logs.logger.info("clicks on Factory Job List checkbox ");

    }

    @And("^fills in info$")
    public void EnterRandomInfo() {
        action.EnterTextField();
        screenshot("Info Entered");
        Logs.logger.info("Info Entered ");

    }

    @And("^clicks on random checkboxes on the page$")
    public void CheckboxesRandom() {
        action.RandomCheckBoxesList();
        screenshot("Miscellaneous checkboxes");
        Logs.logger.info("clicks on Miscellaneous List checkbox ");

    }


}

