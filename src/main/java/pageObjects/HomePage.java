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
    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private WebElement cartCounter;
    @FindBy(xpath = "//div[@class='bag']/a")
    private WebElement CartButton;
    @FindBy(xpath = "//div[@class='selphonenum']")
    private WebElement cityCurrent;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'B')]")
    private WebElement baltiCity;
    @FindBy(xpath = "//div/ul/li/span[contains(text(),'C')]")
    private WebElement chisinauCity;
    public HomePage() {
        super();
    }

    public static void CartCounterAssertCheck() {
        //     Assert.assertTrue(homePage.cartCounter.isDisplayed());
    }

    public void PressCartButton() {
        CartButton.click();
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
