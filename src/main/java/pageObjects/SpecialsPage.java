package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecialsPage extends AbstractPage{
    public SpecialsPage() {super();
    }

    @Override
    public String getUrl() {
        url = "/catalog/26";
        return url;
    }

    @FindBy(xpath = "//div[@class='page-content']//li[2]")
    private WebElement breakfast;
}
