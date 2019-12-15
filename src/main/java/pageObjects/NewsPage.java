package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class NewsPage extends AbstractPage{

    @FindBy(xpath = "(//div[@class='prevslist']//a[@class='button button_serv-next'])")
    private WebElement seeMore;
     @FindBy(xpath = "//a[@class='button button_cr']")
     private WebElement backToNews;

    @Override
    public String url() {
        url = "/news";
        return url;
    }

}
