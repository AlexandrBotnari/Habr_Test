package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BreakfastPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='product__alert v1']")
    private WebElement warMes;
    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private WebElement order;
    private String message = "This dish is available for order from 07:00 to 11:00";

    public BreakfastPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/26/53";
        return url;
    }
}
