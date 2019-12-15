package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@Getter
public class RestaurantsPage  extends AbstractPage{
    public RestaurantsPage() {super();
    }

    @FindBy(xpath = "//button[@class='button button_crb']/span[contains(@class,'i-service')]")
    private List<WebElement> filter;

    @FindBy(xpath = "//div[contains(@class,'restaurant restaurant')]")
    private List<WebElement> restaurantsList;
}
