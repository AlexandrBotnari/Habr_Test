package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HeaderMenuPage extends AbstractPage {

    @FindBy(xpath = "//a[@class='bag__tobag']")
    private WebElement shoppingCart;
    @FindBy(xpath = "(//div[@class='header__addt']//a[contains(@href,'https://www.andys.md')])/..")
    private WebElement languages;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(@href,'https://www.andys.md/En/')]")
    private WebElement languagesEn;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(@href,'https://www.andys.md/Ru/')]")
    private WebElement languagesRu;
    @FindBy(xpath = "//div[@class='header__addt']//a[contains(@href,'https://www.andys.md/Ro/')]")
    private WebElement languagesRo;
    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton1;
    @FindBy(xpath = "//div[@class='selphonenum__curr']")
    private WebElement cityCurrent;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'B')]")
    private WebElement baltiCity;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'C')]")
    private WebElement chisinauCity;
    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'restaurants')]")
    private WebElement restaurants;
    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'news')]")
    private WebElement news;
    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'cariera')]")
    private WebElement career;

    @FindBy(xpath = "//a[@class='header__login-act active']")
    private WebElement login;
    public HeaderMenuPage() {
        super();
    }

    @Override
    public String url() {
        //assert na polnuiu shojesti
        url = "https://www.andys.md/en";
        return url;

    }
}
