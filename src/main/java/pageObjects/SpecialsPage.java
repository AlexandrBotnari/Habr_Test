package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialsPage extends AbstractPage{
    public SpecialsPage() {super();
    }

    @Override
    public String url() {
        url = "/catalog/26";
        return url();
    }

    @FindBy(xpath = "")
    private WebElement breakfast;
}
