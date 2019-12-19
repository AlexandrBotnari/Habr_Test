package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DeliveryPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='section-header-toggle__title']")
    private WebElement deliveryHeader;


    public DeliveryPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/delivery";
        return url;
    }
}
