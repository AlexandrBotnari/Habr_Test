package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
@Setter

public class CartPage extends AndysPage{

    public CartPage() {
        super();
    }

    @Getter
    @FindBy(xpath = "//div[@class='prodlist']//a[@class='link']")
    private  List<WebElement> removeFromCart;
    @FindBy(xpath = "//div[contains(@class,'selcount__current')]")
    private WebElement quantitty;
    @FindBy(xpath = "//div[@class='dbinfo__name']")
    private WebElement informativeMessage;

    @Override
    public String getUrl() {
        return "https://www.andys.md/en/cart";
    }
}
