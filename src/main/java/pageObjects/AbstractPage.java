package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static browser.WebDriverChrome.getDriver;

public abstract class AbstractPage {
    public AbstractPage() {
        init();
    }

    public void init() {
        PageFactory.initElements(getDriver(), this);
    }
}
