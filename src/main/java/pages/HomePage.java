package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class HomePage extends AbstractPage {

    @FindBy(xpath = "//button[@class='button button_serv js-delivery-menu']")
    private WebElement menu;
    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private WebElement cartCounter;
@FindBy(xpath = "//div[@class='modal-menu__content']")
private WebElement menumap;
    @FindBy(xpath = "//a[@class='selcount__action selcount__minus']")
    private WebElement minus;
    @FindBy(xpath = "//a[@class='selcount__action selcount__plus']")
    private WebElement plus;
    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton;
    @FindBy(xpath = "//div[@id='product_1838']//div[@class='product__buy add_to_cart']")
    private WebElement snackToVodka;
    @FindBy(xpath = "//div[@class='header__logo-wrapper']/a")
    private WebElement back;
    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[1]//img[1]" )
    private WebElement specials;
    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[2]")
    private WebElement pizza;

    public HomePage() {
        super();
    }

    public static void CartCounterAssertCheck() {
        //     Assert.assertTrue(homePage.cartCounter.isDisplayed());
    }


    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement careerPage;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en";
        return url;
    }
}
