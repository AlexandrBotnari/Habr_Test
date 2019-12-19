package pageObjects;

import pageObjects.AbstractPage;
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
    @FindBy(xpath = "//li[@class='dropmenu__item dropmenu__item_isdrop active']//li[2]")
    private WebElement Program_F2F;
    @Override
    public String getUrl() {
url = "/we_are_looking_for_tasters";
        return null;
    }
}
