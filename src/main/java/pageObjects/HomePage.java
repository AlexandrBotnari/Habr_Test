package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage {

    HomePage homePage;

    public HomePage() {
        super();
    }

    @FindBy(xpath = "//button[@class='button button_serv js-delivery-menu']")
    private WebElement menuButton;

    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private WebElement cartCounter;
    @FindBy(xpath = "//*[@class='svgspr svgspr__ui_icon_bag']")
    private WebElement cartButton;
    @FindBy(xpath = "//a[@class='button button_end']")
    private WebElement orderButton;
    @FindBy(xpath = "//div[@class='selphonenum']")
    private WebElement cityCurrent;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'B')]")
    private WebElement baltiCity;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'C')]")
    private WebElement chisinauCity;
    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Feedback')]")
    private WebElement feedbackButton;
    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Contacts')]")
    private WebElement contactsButton;
    @FindBy(xpath = "//li[@class='adilinks__item']//a[contains(text(),'Delivery')]")
    private WebElement deliveryButton;




    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement careerPage;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en";
        return url;
    }


}
