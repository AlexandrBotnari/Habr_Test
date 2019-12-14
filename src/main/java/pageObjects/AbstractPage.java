package pageObjects;

import org.openqa.selenium.support.PageFactory;

import static browser.Driver.getDriver;


public abstract class AbstractPage implements Page {

protected String url;

    public AbstractPage(){
        init();
    }

    public void init() {
        PageFactory.initElements(getDriver(), this);
    }

    @Override
    public String getUrl() {
        return url;
    }
}
