package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Getter
public class LunchPage extends AbstractPage{
    public LunchPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='product__header']")
    private List<WebElement> productLunchNames;

    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private WebElement buyProductLunch;

    @FindBy(xpath = "//div[@class='product__date']")
    private List<WebElement> productDateLunch;
    @FindBy(xpath = "//a[@class= 'button button_end' ]")
    private WebElement orderButton;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/14";
        return url;
    }
}
