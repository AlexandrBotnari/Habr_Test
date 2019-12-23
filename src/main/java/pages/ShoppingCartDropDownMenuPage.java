package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Getter
public class ShoppingCartDropDownMenuPage extends AndysPage {
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
@FindBy(xpath = "//div[@class='selcount__current product_quan']")
private WebElement quantitty;
    @Override
    public String getUrl() {
        return null;
    }
}
