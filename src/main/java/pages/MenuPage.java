package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class MenuPage extends AbstractPage {
    public MenuPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[*]")
    private List<WebElement> menuList;

    @FindBy(xpath = "//div[@class='product__img show_order_win']")
    private List<WebElement> productPhotoList;

    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private List<WebElement> productList;

    @FindBy(xpath = "//div[@class='product__alert_msg']")
    private WebElement productAlertMessage;



    @Override
    public String getUrl() {
        url = "https://www.andys.md/en";
        return url;
    }
}
