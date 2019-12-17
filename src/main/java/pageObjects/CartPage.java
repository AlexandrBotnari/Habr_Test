package pageObjects;

import org.openqa.selenium.support.FindBy;

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

public class CartPage extends AbstractPage{

    public CartPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='prodlist']//a[@class='link']")
    private  List<WebElement> removeFromCart;

    public List<WebElement> getRemoveFromCart() {
        return removeFromCart;
    }

    @Override
    public String getUrl() {
        return "/cartPage";
    }
}
