package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {
    public AccountPage() {super();
    }

    @FindBy(xpath = "//div[@class='invback']")
    private WebElement accountForm;
}
