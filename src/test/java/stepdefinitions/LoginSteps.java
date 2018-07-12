package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps {


    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        System.out.println("Select Login Button");
    }

    @Then("^User is logged into Account$")
    public void userIsLoggedIntoAccount() throws Throwable {
        System.out.println("Logged into Account");
    }
}
