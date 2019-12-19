package steps;

import cucumber.api.java.en.When;
import utlis.Action;

public class PizzaSteps {
    Action action = new Action();

    @When("^user opens random product$")
    public void userOpensRandomProductPreview() {

        action.GetRandomProductPhoto();
    }
}
