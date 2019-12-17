package pageObjects;

import lombok.Getter;
import org.checkerframework.checker.units.qual.Current;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utlis.Annotation.CurrentPage;

import java.lang.annotation.Annotation;

@Getter
public class LoginPage extends AbstractPage{
    public LoginPage() {super();
    }

    @Override
    public String getUrl() {
        url="/login";
        return url;
    }

    /////Login form ////////
    @FindBy(xpath = "//input[@id='email']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @CurrentPage
    @FindBy(xpath = "//input[@class='button button_s']")
    private WebElement loginButton;

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
