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


@Getter
@Setter

public class MenuPage extends AbstractPage {
    public MenuPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[*]")
    private  List<WebElement> MenuList;


    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private  List<WebElement> ProductList;


    public  List<WebElement> getMenuList() {
        return MenuList;
    }

    public  List<WebElement> getProductList() {
        return ProductList;
    }


    private WebElement lunchButton1;

}
