package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LunchPage {
    @FindBy(xpath = "//div[@class='product__header']")
    private List<WebElement> productLunchNames;

    @FindBy(xpath = "//div[@class='product__buy']")
    private List<WebElement> buyProductLunch;

    @FindBy(xpath = "//div[@class='product__date']")
    private List<WebElement> productDateLunch;
}
