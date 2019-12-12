package pageObjects.services;

import pageObjects.Page;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class ClientCardPage extends Page {

    public ClientCardPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1[@xpath='1']")
    private WebElement textHeader;
    @FindBy(xpath = "//h4[contains(text(),'Attention!')]")
    private WebElement remarkForCustomer;


}
