package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstarctPage {
    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
