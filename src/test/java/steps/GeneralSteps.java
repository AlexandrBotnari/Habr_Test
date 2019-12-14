package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browser.Driver.getDriver;

public class GeneralSteps {

    public static String getUrl() {
        return getDriver().getCurrentUrl();
    }

    public void clickButton(WebElement button){
        button.click();
    }

}
