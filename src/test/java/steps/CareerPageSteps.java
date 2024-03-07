package steps;

import Context.Keys;
import Context.ScenarioContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AbstractPage;
import utils.Action;
import utils.Logs;
import utils.reflectionHelper.Reflection;

import static utils.screenshots.Screenshots.screenshot;

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




    @When("^user fills in name = \"(.*)\",Old = \"(.*)\",Phone = \"(.*)\", Email = \"(.*)\"$")
    public void userFillsInNameOldPhoneEmail(String name, String old, String phone, String mail) throws IllegalAccessException {
        Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"nameField").sendKeys(name);
        Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"oldField").sendKeys(old);
        Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"phoneField").sendKeys(phone);
        Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"mailField").sendKeys(mail);

    }

    @And("^choose some optional checkBoxes$")
    public void chooseSomeOptionalCheckBoxes() throws IllegalAccessException {
        action.RestaurantJobsListRandom();
        screenshot("Restaurant Job List checkboxes");
        Logs.logger.info("clicks on Restaurant Job List checkbox ");
        Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"factoryTabButton").click();
        action.FactoryJobsListRandom();
        screenshot("Factory Job List checkboxes");
        Logs.logger.info("clicks on Factory Job List checkbox ");


    }

    @Then("^all inserted information is displayed in fields$")
    public void allInsertedInformationIsDisplayedInFields() throws IllegalAccessException {
        Assert.assertNotNull(Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"nameField").getText());
        Assert.assertNotNull(Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"oldField").getText());
        Assert.assertNotNull(Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"phoneField").getText());
        Assert.assertNotNull(Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE),"mailField").getText());

    }
}

