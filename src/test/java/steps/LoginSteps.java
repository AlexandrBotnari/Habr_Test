package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

import static utlis.screenshots.Screenshots.screenshot;

;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String login, String password) {
        Assert.assertTrue(loginPage.getLogin().isEnabled());
        Assert.assertTrue(loginPage.getPassword().isEnabled());
        loginPage.getEmail().sendKeys(login);
        loginPage.getPassword().sendKeys(password);
        loginPage.getEmail().click();
        screenshot("enter login and password");
    }
}
