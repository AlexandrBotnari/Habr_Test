package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static browser.Driver.getDriver;

@Getter
@Setter
public class HomePage extends AbstractPage {

    HomePage homePage;

    public HomePage() {
        super();
    }

    @FindBy(xpath = "//button[@class='button button_serv js-delivery-menu']")
    private  WebElement menuButton;

    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private  WebElement cartCounter;

    @FindBy(xpath = "//div[@class='bag__products']")
    private WebElement CartButton;

    public void PressCartButton(){
        CartButton.click();
    }

    public void PressMenuButton() {
        menuButton.click();

    }

    public static void CartCounterAssertCheck() {
   //     Assert.assertTrue(homePage.cartCounter.isDisplayed());
    }

}
