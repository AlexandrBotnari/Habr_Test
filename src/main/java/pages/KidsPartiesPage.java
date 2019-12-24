package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class KidsPartiesPage extends AndysPage {

    public KidsPartiesPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;

    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Chi')]")
    private WebElement RestaurantsLocationChisinau;
    @FindBy(xpath ="//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]" )
    private WebElement services;
    @FindBy(xpath = "//div[@class='block-title'][contains(text(),'Bal')]")
    private WebElement RestaurantsLocationBalti;

    @FindBy(xpath = "(//div[@class='restaurant__act'])[1]")
    private WebElement seeMoreButtoт;

    @FindBy(xpath = "//div[@class='restaurant__contacts']")
    private List<WebElement> tellNumbers;

    @FindBy(xpath = "//h1[@xpath='1']")
    private WebElement textHeader;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/party";
        return url;
    }
}
