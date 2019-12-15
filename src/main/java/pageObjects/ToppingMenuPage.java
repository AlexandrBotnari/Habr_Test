package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class ToppingMenuPage extends AbstractPage{
    public ToppingMenuPage() {super();
    }
    @FindBy(xpath = "//div[@class='modal-product__content']")
    private WebElement toppingMenu;

    @FindBy(xpath = "//a[@class='selcount__action selcount__minus']")
    private WebElement minus;

    @FindBy(xpath = "//a[@class='selcount__action selcount__plus']")
    private WebElement plus;

    @FindBy(xpath = "//button[@class='button button_add add_to_cart']")
    private WebElement  order;

    @FindBy(xpath = "//div[@class='selcount__current selcount__current_zero']")
    private WebElement number;
}
