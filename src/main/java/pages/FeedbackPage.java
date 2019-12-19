package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class FeedbackPage extends AbstractPage {

    @FindBy(xpath = "//p[contains(text(),'All feedbacks are saved on the website and will be')]")
    private WebElement feedbackAssertCheck;

    public FeedbackPage() {
        super();
    }

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/feedback";
        return url;
    }
}
