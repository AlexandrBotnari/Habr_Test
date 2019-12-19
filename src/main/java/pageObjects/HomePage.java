package pageObjects;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//button[@class='button button_serv js-delivery-menu']")
    private WebElement menuButton;
//    @FindBy(xpath = "//a[contains(text(),'Menu')]")
//    private WebElement menubuttonn;
    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private WebElement cartCounter;
    @FindBy(xpath = "//div[@class='bag']")
    private WebElement cartButton;
    @FindBy(xpath = "//a[@class='selcount__action selcount__minus']")
    private WebElement minus;
    @FindBy(xpath = "//a[@class='selcount__action selcount__plus']")
    private WebElement plus;
    @FindBy(xpath = "//div[@class='selphonenum']")
    private WebElement cityCurrent;
    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'B')])[2]")
    private WebElement balti;
    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'C')])[2]")
    private WebElement chisinau;
    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton;
    @FindBy(xpath = "//div[@id='product_1838']//div[@class='product__buy add_to_cart']")
    private WebElement snackToVodka;
    @FindBy(xpath = "//div[@class='header__logo-wrapper']/a")
    private WebElement back;
    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[1]//img[1]" )
    private WebElement specials;
    @FindBy(xpath ="//li[@class='dropmenu__item dropmenu__item_isdrop ']/a[contains(text(),'Services')]" )
    private WebElement services;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'En')]")
    private WebElement En;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'Ru')]")
    private WebElement Ru;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'Ro')]")
    private WebElement Ro;
    @FindBy(xpath = "//a[@class= 'button button_end' ]")
    private WebElement orderButton;

    public HomePage() {
        super();
    }

    public static void CartCounterAssertCheck() {
        //     Assert.assertTrue(homePage.cartCounter.isDisplayed());
    }

    public void PressCartButton() {
        cartButton.click();
    }

    public void PressMenuButton() {
        menuButton.click();

    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en";
        return url;
    }
}
