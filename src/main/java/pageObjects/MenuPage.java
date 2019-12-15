package pageObjects;

import browser.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.AbstractPage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import utlis.RandomListSelect;

import java.util.List;

import static browser.Driver.getDriver;

@Getter
@Setter

public class MenuPage extends AbstractPage {
    public MenuPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[*]")
    private static List<WebElement> MenuList;


    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[*]/div[4]")
    private static List<WebElement> ProductList;

    public static void GetRandomCategory() {
        RandomListSelect.GetRandomFromList(MenuPage.MenuList).click();

    }

    public static void GetRandomProduct() {
        RandomListSelect.GetRandomFromList(MenuPage.ProductList).click();

    }

    private WebElement lunchButton1;

}
