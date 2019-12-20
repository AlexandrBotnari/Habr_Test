package pages;

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
    @FindBy(xpath ="//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]" )
    private WebElement services;
    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/andys_live";
        return url;
    }
}
