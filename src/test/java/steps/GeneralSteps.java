package steps;

import Context.Keys;
import Context.ScenarioContext;
import browser.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AbstractPage;
import utlis.Logs;
import utlis.reflectionHelper.Reflection;

import java.lang.reflect.InvocationTargetException;

import static utlis.screenshots.Screenshots.highLighterMethod;
import static utlis.screenshots.Screenshots.screenshot;


public class GeneralSteps {





    public static String getUrl() {
        return Driver.getInstance().getDriver().getCurrentUrl();
    }

    Actions actions = new Actions(Driver.getInstance().getDriver());

    @Then("^\"(.*)\" is opened$")
    public void isOpened(String pageName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AbstractPage page = Reflection.getPage(pageName);
        Assert.assertEquals(getUrl(),page.getUrl());
        ScenarioContext.set(Keys.CURRENT_PAGE, page);
        screenshot(pageName);
        Logs.logger.info(page.getClass().getSimpleName() + "is opened");

    }

    @When("^user navigate on \"(.*)\"$")
    public void userNavigateOn(String element) throws IllegalAccessException {
        WebElement webElement = Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE), element);
        actions.moveToElement(webElement).perform();
        Logs.logger.info("user navigate on " + element);
    }

    @When("^user clicks on \"(.*)\" button$")
    public void userClicksOnButton(String button) throws Throwable {
        WebElement webElement = Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE), button);
        highLighterMethod(webElement);
        screenshot(button);
        Logs.logger.info("user clicks on " + button + " button");
        webElement.click();




    }



    @Then("^\"(.*)\" menu services appears$")
    public void menuServicesAppears(String element) throws Throwable {
        WebElement webElement = Reflection.getElement((AbstractPage) ScenarioContext.get(Keys.CURRENT_PAGE), element);
        highLighterMethod(webElement);
        screenshot(element);
        Logs.logger.info("menu services appears");
        Assert.assertTrue(webElement.isDisplayed());
    }
}
