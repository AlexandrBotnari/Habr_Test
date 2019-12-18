package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DeliveryPage extends AbstractPage {

    public DeliveryPage() {super();
    }


    @FindBy(xpath = "//div[@class='section-header-toggle__title']")
    private WebElement deliveryHeader;

    @Override
    public String getUrl() {
        return null;
    }
}
