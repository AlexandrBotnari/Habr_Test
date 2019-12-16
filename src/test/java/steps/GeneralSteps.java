package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import reflectionHelper.Reflection;


import java.io.File;

import static browser.Driver.getDriver;

public class GeneralSteps {

    Reflection reflection = new Reflection();

    public static String getUrl() {
        return getDriver().getCurrentUrl();
    }

    @Then("^\"([^\"]*)\" page is opened$")
    public void isOpened(String url) {
        //reflection.currentPage(+);

    }


    @When("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String button) throws Throwable {

    }



    public void screenshot(String fol, String name){
        try{
            TakesScreenshot ts = (TakesScreenshot)getDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./screenshots/" + fol + name + ".png"));
            System.out.println("Screenshot taken");

        }
        catch (Exception e){
            System.out.println("Exception while taking screenshots" + e.getMessage());

        }

    }
}
