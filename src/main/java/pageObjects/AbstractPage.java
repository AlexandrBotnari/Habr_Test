package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static browser.Driver.getDriver;


public abstract class AbstractPage implements Page {
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'We are')]" )
    private WebElement WeAreLookingForTasters;
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Program')]" )
    private WebElement Program_F2F;
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Client')]" )
    private WebElement ClientCard ;
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Corporate')]" )
    private WebElement CorporateClient;
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Kids')]" )
    private WebElement KidsParties;
    @FindBy(xpath = "//ul[@class='verlist__col']//a[contains(text(),'Banquets')]" )
    private WebElement Banquets;

    protected String url;

    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }



}
