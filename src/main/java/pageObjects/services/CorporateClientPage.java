package pageObjects.services;

import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class CorporateClientPage extends AbstractPage {
    public CorporateClientPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath = "//h1//u[contains(text(),'Company')]")
    private WebElement textHeader;

    @Override
    public void url() {
        url = "/andys_live";
    }
}
