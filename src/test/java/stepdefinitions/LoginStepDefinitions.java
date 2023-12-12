package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import pages.TopMenu;
import tasks.Navigate;

public class LoginStepDefinitions {

    @Given("{actor} is on the home page")
    public void navigateToLoginPage(Actor actor) {
        actor.wasAbleTo(
                Navigate.toTheHomePage(),
                Click.on(TopMenu.MY_ACCOUNT_MENU)
        );

    }

    @When("he login with valid user and password")
    public void user_login_with_valid_user_and_password() {

    }
}
