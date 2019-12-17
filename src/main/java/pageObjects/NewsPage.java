package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends AbstractPage{

    @FindBy(xpath = "(//div[@class='prevslist']//a[@class='button button_serv-next'])")
    private WebElement seeMore;
     @FindBy(xpath = "//a[@class='button button_cr']")
     private WebElement backToNews;

    @Override
    public String getUrl() {
        url = "/news";
        return url;
    }

}
