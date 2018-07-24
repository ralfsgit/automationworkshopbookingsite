package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps {

    @And("^I select Account menu Log in button$")
    public void iSelectAccountMenuLogInButton() throws Throwable {
        selectAccountMenuLogInButton();
    }

    @And("^I select Log in button$")
    public void iSelectLogInButton() throws Throwable {
        selectLogInButton();
    }

    @Then("^user is logged into account$")
    public void userIsLoggedIntoAccount() throws Throwable {
        System.out.println("User is logged into Account!");
    }
}
