package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static browser.Driver.getDriver;

@Getter
public abstract class AbstractPage implements Page {

    protected String url;


    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }

}
