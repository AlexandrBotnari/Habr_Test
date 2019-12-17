package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @Override
    public String getUrl() {
        return null;
    }
}
