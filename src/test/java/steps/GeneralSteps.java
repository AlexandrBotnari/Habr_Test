package steps;

import Context.Keys;
import Context.ScenarioContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.joda.time.LocalTime;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.AbstractPage;
import utlis.reflectionHelper.Reflection;

import java.lang.reflect.InvocationTargetException;

import static browser.Driver.getDriver;

public class GeneralSteps {


    public static String getUrl() {
        return getDriver().getCurrentUrl();
    }
    final LocalTime before = new LocalTime(12, 0, 0, 0);
    final LocalTime after = new LocalTime(15, 0, 0, 0);
    LocalTime currentTime = new LocalTime();
    Actions actions = new Actions(getDriver());

    @Then("^\"(.*)\" is opened$")
    public void isOpened(String pageName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AbstractPage page = Reflection.getPage(pageName);
        Assert.assertEquals(getUrl(),page.getUrl());
        ScenarioContext.set(Keys.CURRENT_PAGE, page);

    }

    @When("^user navigate on \"(.*)\"$")
    public void userNavigateOn(String element) throws IllegalAccessException {
        WebElement webElement = Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE), element);
        actions.moveToElement(webElement).perform();
    }

    @Then("^dropdown menu appears$")
    public void dropdownMenuAppears(){

    }
    @When("^user clicks on \"(.*)\" button$")
    public void userClicksOnButton(String button) throws Throwable {
        WebElement webElement = Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE), button);
        webElement.click();

    }
}
