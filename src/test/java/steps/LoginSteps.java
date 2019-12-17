package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String login, String password){
        loginPage.getLogin().sendKeys(login);
        loginPage.getPassword().sendKeys(password);
        loginPage.getLoginButton().click();
    }
}
