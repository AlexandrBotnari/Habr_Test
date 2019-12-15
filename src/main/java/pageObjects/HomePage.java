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
    public HomePage() {
        super();
    }

    @FindBy(xpath = "//button[@class='button button_serv js-delivery-menu']")
    private static WebElement MenuButton;

    @FindBy(xpath = "//div[@class='bag__count cart_count']")
    private static WebElement CartCounter;


    public static void PressMenuButton() {
        MenuButton.click();

    }

    public static void CartCounterAssertCheck() {
        Assert.assertTrue(CartCounter.isDisplayed());
    }

}
