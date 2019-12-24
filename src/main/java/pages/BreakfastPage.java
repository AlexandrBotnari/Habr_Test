package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BreakfastPage extends AndysPage {
    @FindBy(xpath = "//div[@class='product__alert v1']")
    private WebElement warMes;
    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private WebElement order;
    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private WebElement cartIndex;

    public BreakfastPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/53";
        return url;
    }
}
