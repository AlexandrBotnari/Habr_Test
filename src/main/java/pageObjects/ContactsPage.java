package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ContactsPage extends AbstractPage {

    public ContactsPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='section-header']")
    private WebElement  contactsHeader;


    @Override
    public String getUrl() {

        return url;

    }
}

