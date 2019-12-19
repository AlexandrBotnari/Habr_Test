package pages;

import annotaion.PageName;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@PageName(name = "Career Page")
public class CareerPage extends AbstractPage {


    @FindBy(xpath = "//input[@class=\"input-text input-text_form\"]")
    private List<WebElement> informationFillList;

    @FindBy(xpath = "//div[@class='infoctgs']")
    private WebElement informationListBlock;

    @FindBy(xpath = "//div[contains(text(),'Restaurant Jobs:')]")
    private WebElement restaurantTabButton;

    @FindBy(xpath = "//div[@id='tab_content_1']//label[@class='input-checkbox']//div[1]")
    private List<WebElement> restaurantJobsList;

    @FindBy(xpath = "//div[contains(text(),'Factory Jobs:')]")
    private WebElement factoryTabButton;

    @FindBy(xpath = "//div[@id='tab_content_2']//label[@class='input-checkbox']//div[1]")
    private List<WebElement> factoryJobsList;

    @FindBy(xpath = "//div[@class='imdata-list imdata-list_5']//div[@class='input-checkbox__checkmark']")
    private List<WebElement> randomCheckBoxesList;

    @FindBy(xpath = "//div[contains(text(),'Fill information about you')]")
    private WebElement informationFieldMenu;


    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/cariera";
        return url;
    }
}
