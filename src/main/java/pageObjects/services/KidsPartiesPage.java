package pageObjects.services;

import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@Setter
public class KidsPartiesPage extends AbstractPage {

    public KidsPartiesPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Chi')]")
    private WebElement RestaurantsLocationChisinau;

    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Bal')]")
    private WebElement RestaurantsLocationBalti;

    @FindBy(xpath = "(//div[@class='restaurant__act'])[1]")
    private WebElement seeMoreButtoт;

    @FindBy(xpath = "//div[@class='restaurant__contacts']")
    private List<WebElement> tellNumbers;

    @FindBy(xpath = "//h1[@xpath='1']")
    private WebElement textHeader;

    @Override
    public String url() {
        url = "/party";
        return null;
    }
}
