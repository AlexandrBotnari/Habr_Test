package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class NewsPage  extends Page{
    public NewsPage() {super();
    }
    @FindBy (xpath = "(//div[@class='prevslist']//a[@class='button button_serv-next'])")
    private WebElement seeMoreButton;

    @FindBy (xpath = "//a[@class='button button_cr']")
    private  WebElement backToNewsButton;

    String newsUrl = "news/";
}
