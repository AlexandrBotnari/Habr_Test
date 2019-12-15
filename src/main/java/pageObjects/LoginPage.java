package pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class LoginPage extends AbstractPage{
    public LoginPage() {super();
    }

    @Override
    public String url() {
        url="/login";
        return url();
    }

    /////Login form ////////
    @FindBy(xpath = "//input[@id='email']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@class='button button_s']")
    private WebElement loginButton;


}
