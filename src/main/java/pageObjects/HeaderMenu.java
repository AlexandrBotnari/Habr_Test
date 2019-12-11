package pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class HeaderMenu {

    @FindBy(xpath = "//a[@class='bag__tobag']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//div[@class='header__addt']//a[contains(@href,'https://www.andys.md/')]")
    private WebElement languages;

    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton;

    @FindBy(xpath = "//div[@class='product__header']")
    private List<WebElement> productLunchNames;

    @FindBy(xpath = "//div[@class='product__buy']")
    private List<WebElement> buyProductLunch;

    @FindBy(xpath = "//div[@class='product__date']")
    private List<WebElement> productDateLunch;

    @FindBy(xpath = "//div[@class='selphonenum__curr']")
    private WebElement cityCurrent;

    @FindBy(xpath = "//div/ul/li/span[contains(text(),'B')]")
    private WebElement baltiCity;

    @FindBy(xpath = "//div/ul/li/span[contains(text(),'C')]")
    private WebElement chisinauCity;

    @FindBy(xpath = "//div[@class='bag__header']")
    private WebElement shoppingCartDDHeader;

    @FindBy(xpath = "//a[@class='bag__list-close']")
    private List<WebElement> shoppingCartDDProductsDelete;

    @FindBy(xpath = "//div[@class='bag__list-header']")
    private List<WebElement> shoppingCartDDProductsHeader;

    @FindBy(xpath = "//a[@class='selcount__action selcount__minus'")
    private List<WebElement> shoppingCartDDProductsMinus;

    @FindBy(xpath = "//a[@class='selcount__action selcount__plus'")
    private List<WebElement> shoppingCartDDProductsPlus;

    @FindBy(xpath = "//a[@class= 'button button_end' ]")
    private WebElement orderButton;

    @FindBy(xpath = "//span[@class='cart_total']")
    private WebElement totalPrice;

    @FindBy(xpath = "//span[@class='cart_delivery']")
    private WebElement deliveryPrice;

}
