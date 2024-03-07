package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class LoginPage extends AndysPage {
    public LoginPage() {
        super();
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@class='button button_s']")
    private WebElement login;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @Override
    public String getUrl() {
        url = "https://www.andys.md/en/login";
        return url;
    }
}
