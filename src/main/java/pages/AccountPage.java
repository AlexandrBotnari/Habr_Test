package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='invback']")
    private WebElement accountForm;

    public AccountPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/account/";

        return url;
    }
}
