package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialsPage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Lunch')]")
    private WebElement lunchButton;

    public SpecialsPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26";
        return url;
    }
}
