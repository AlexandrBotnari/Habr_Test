package pageObjects;

import browser.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class Page {

    private Driver driver;

    public Page(){
        init();
    }


    public void init() {

        PageFactory.initElements(driver.getDriver(), this);
    }
}
