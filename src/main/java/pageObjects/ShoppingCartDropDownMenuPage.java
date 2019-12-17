package pageObjects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Getter
@Setter
public class ShoppingCartDropDownMenuPage  extends AbstractPage{
    public ShoppingCartDropDownMenuPage() {
        super();
    }
    @FindBy(xpath = "//div[@class='bag__header']")
    private WebElement shoppingCartDDHeader;

    @FindBy(xpath = "//a[@class='bag__list-close']")
    private List<WebElement> shoppingCartDDProductsDelete;

    @FindBy(xpath = "//div[@class='bag__list-header']")
    private List<WebElement> shoppingCartDDProductsHeader;

    @FindBy(xpath = "//a[@class='selcount__action selcount__minus'")
    private WebElement shoppingCartDDProductsMinus;

    @FindBy(xpath = "//a[@class='selcount__action selcount__plus'")
    private WebElement shoppingCartDDProductsPlus;

    @FindBy(xpath = "//a[@class= 'button button_end' ]")
    private WebElement orderButton;

    @FindBy(xpath = "//span[@class='cart_total']")
    private WebElement totalPrice;

    @FindBy(xpath = "//span[@class='cart_delivery']")
    private WebElement deliveryPrice;

    @Override
    public String getUrl() {
        return null;
    }
}
