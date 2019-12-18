package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class FeedbackPage extends AbstractPage {

    public FeedbackPage() {
        super();
    }

    @FindBy(xpath = "//p[contains(text(),'All feedbacks are saved on the website and will be')]")
    private WebElement feedbackAssertCheck;

    @Override
    public String getUrl() {
        return null;
    }
}
