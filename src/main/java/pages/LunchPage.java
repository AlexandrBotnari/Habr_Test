package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Getter
public class LunchPage extends AndysPage{
    public LunchPage() {
        super();
    }


    @FindBy(xpath = "//div[@class='product__buy']")
    private WebElement order;

    @FindBy(xpath = "//div[@class='product__date']")
    private WebElement productDateLunch;

@FindBy(xpath = "//div[@class='bag__count cart_count']")
private WebElement cartIndex;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/14";
        return url;
    }
}
