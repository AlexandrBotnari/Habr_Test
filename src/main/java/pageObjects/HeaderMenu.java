package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HeaderMenu extends AbstractPage {


    @FindBy(xpath = "//div[@class='selphonenum']")
    private WebElement cityCurrent;

    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'B')])[2]")
    private WebElement balti;

    @FindBy(xpath = "(//div/ul/li/span[contains(text(),'C')])[2]")
    private WebElement chisinau;


    @Override
    public String getUrl() {

        url = "https://www.andys.md/en";
        return url;

    }
}
