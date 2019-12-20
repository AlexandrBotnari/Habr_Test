package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class LookingforTastersPage extends AbstractPage {

    public LookingforTastersPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='img-header__title']")
    private WebElement image_textHolder;
    @FindBy(xpath ="//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]" )
    private WebElement services;

    @Override
    public String getUrl() {
url = "https://www.andys.md/en/we_are_looking_for_tasters";
        return url;
    }
}
