package pageObjects;

import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class MenuPage extends AbstractPage {
    public MenuPage() {
        super();
    }

    @FindBy(xpath = "//div[@class='modal-menu modal-menu_open']//a[*]")

    private List<WebElement> menuList;
    @FindBy(xpath = "//a[contains(@href,'26')]")
    private WebElement specials;
    @FindBy(xpath = "//div[@class='product__buy add_to_cart']")
    private List<WebElement> productList;
    @FindBy(xpath = "//div[@class='product__alert_msg']")
    private WebElement productAlertMessage;

    @Override
    public String getUrl() {
        url = "sefse";
        return url;
    }
}
