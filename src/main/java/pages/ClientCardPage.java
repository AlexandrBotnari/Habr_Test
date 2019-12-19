package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class ClientCardPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1[@xpath='1']")
    private WebElement textHeader;
    @FindBy(xpath = "//h4[contains(text(),'Attention!')]")
    private WebElement remarkForCustomer;
    @FindBy(xpath = "//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]")
    private WebElement services;

    public ClientCardPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "/clients_card";
        return url;
    }
}
