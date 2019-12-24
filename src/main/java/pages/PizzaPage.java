package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PizzaPage extends AndysPage {
    @FindBy(xpath = "//button[@class='button button_add add_to_cart']")
    private WebElement order;
    @FindBy(xpath = "//div[@class='modal-product__info']")
    private WebElement toppingMenu;
    @FindBy(xpath = "//div[@class='modal-product__info']//div[@class='tabs']")
    private WebElement toppingTabs;
    @FindBy(xpath = "//a[@class='selcount__action selcount__minus']")
    private WebElement minus;
    @FindBy(xpath = "(//a[@class='selcount__action selcount__plus'])[1]")
    private WebElement plus;
    @FindBy(xpath = "//div[@class='selcount__current selcount__current_zero']")
    private WebElement number;
    @FindBy(xpath = "//div[@class='modal-product__close']")
    private WebElement close;

    public PizzaPage() {
        super();
    }

    public void close() {
        close.click();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/catalog/8";
        return url;
    }
}
