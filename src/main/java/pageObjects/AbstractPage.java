package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static browser.Driver.getDriver;


public abstract class AbstractPage implements Page {

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'We are')]")
    private WebElement WeAreLookingForTasters;

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Program')]")
    private WebElement Program_F2F;

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Client')]")
    private WebElement ClientCard;

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Corporate')]")
    private WebElement CorporateClient;

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Kids')]")
    private WebElement KidsParties;

    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Banquets')]")
    private WebElement Banquets;

    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Feedback')]")
    private WebElement feedbackButton;

    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Contacts')]")
    private WebElement contactsButton;

    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Delivery')]")
    private WebElement deliveryButton;

    @FindBy(xpath = "//div[@class='bag']")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@class='selphonenum']")
    private WebElement cityCurrent;

    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'En')]")
    private WebElement En;

    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'Ru')]")
    private WebElement Ru;

    @FindBy(xpath = "//div[@class='header__addt']//a[contains(text(),'Ro')]")
    private WebElement Ro;

    @FindBy(xpath = "//a[@class= 'button button_end' ]")
    private WebElement orderButton;

    @FindBy(xpath = "//li[@class='dropmenu__item dropmenu__item_isdrop ']/a[contains(text(),'Services')]")
    private WebElement services;

    @FindBy(xpath = "//a[@class='prodimgp']/div[contains(text(),'Lunch')]")
    private WebElement lunchButton1;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'restaurants')]")
    private WebElement restaurants;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'news')]")
    private WebElement news;

    @FindBy(xpath = "//ul[@class='dropmenu']//a[contains(@href,'cariera')]")
    private WebElement career;

    @FindBy(xpath = "//a[@class='header__login-act active']")
    private WebElement login;

    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'B')])[2]")
    private WebElement balti;

    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'C')])[2]")
    private WebElement chisinau;


    protected String url;

    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }


}
