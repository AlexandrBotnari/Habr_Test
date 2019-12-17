package pageObjects.services;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.AbstractPage;

@Getter
@Setter
public class ClientCardPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1[@xpath='1']")
    private WebElement textHeader;
    @FindBy(xpath = "//h4[contains(text(),'Attention!')]")
    private WebElement remarkForCustomer;

    public ClientCardPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "/clients_card";
        return null;
    }
}
