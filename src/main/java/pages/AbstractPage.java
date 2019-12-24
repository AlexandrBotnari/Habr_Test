package pages;

import browser.Driver;
import lombok.Getter;
import org.openqa.selenium.support.PageFactory;


@Getter
public abstract class AbstractPage implements Page {

    protected String url;

    public AbstractPage() {
        PageFactory.initElements(Driver.getInstance().getDriver(), this);
    }

}
