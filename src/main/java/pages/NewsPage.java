package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class NewsPage extends AndysPage {
    @FindBy(xpath = "//a[@class='button button_cr']")
    private WebElement backToNews;

    @FindBy(xpath = "(//div[@class='prevslist']//a[@class='button button_serv-next'])")
    private WebElement seeMore;

    public NewsPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/news";
        return url;
    }

}
