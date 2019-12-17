package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class BreakfactPage extends AbstractPage {
    public BreakfactPage() { super();
    }

@FindBy(xpath = "//div[@class='product__alert v1']")
    private WebElement warMes;

    private String message = "This dish is available for order from 07:00 to 11:00";
}
