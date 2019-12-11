package pageObjects;

import browser.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static browser.Driver.getDriver;


public abstract class Page {

    public Page(){
        init();
    }

    public void init() {
        PageFactory.initElements(getDriver(), this);
    }
}
