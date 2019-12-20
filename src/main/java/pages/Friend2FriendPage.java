package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class Friend2FriendPage extends AbstractPage {

    public Friend2FriendPage() {
        super();
    }

    @FindBy(xpath = "//h1/strong")
    private WebElement textHeader;

    @FindBy(xpath = "(//p/u/strong)[4]")
    private WebElement lastPoint;
    @FindBy(xpath ="//li[contains(@class,'dropmenu__item dropmenu__item_isdrop ')]/a[contains(text(),'Services')]" )
    private WebElement services;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/regulations_of_the_loyalty_program_friends_2_friends";
        return url;
    }
}
