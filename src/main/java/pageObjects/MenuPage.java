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
    private  List<WebElement> menuList;


    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private  List<WebElement> productList;

    @FindBy(xpath = "//div[@class='product__alert_msg']")
    private  WebElement productAlertMessage;


    public  List<WebElement> getMenuList() {
        return menuList;
    }

    public  List<WebElement> getProductList() {
        return productList;
    }


    private WebElement lunchButton1;


    @Override
    public String getUrl() {
        url = "sefse";
        return url;
    }
}
