package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SpecialsPage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'Breakfast')]")
    private WebElement breakfast;

    public SpecialsPage() {
        super();
    }

    @Override
    public String getUrl() { ;
        return "https://www.andys.md/en/catalog/26";
    }
}