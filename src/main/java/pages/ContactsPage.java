package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ContactsPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='section-header']")
    private WebElement contactsHeader;

    public ContactsPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/contacts";

        return url;

    }
}

