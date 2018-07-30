package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.login.LogInPageObject;

public class LoginSteps {

//    @Given("^I navigate to Signup Page$")
//    public void iNavigateToSignUpPage() throws Throwable {
//        iSelectMyAccountMenu();
//        iSelectAccountMenuSignUpButton();
//    }
private LogInPageObject login = new LogInPageObject();

    @And("^I select Account menu Log in button$")
    public void iSelectAccountMenuLogInButton() throws Throwable {

    }

    @And("^I select Log in button$")
    public void iSelectLogInButton() throws Throwable {
        login.selectLoginButton();
    }

    @Then("^user is logged into account$")
    public void userIsLoggedIntoAccount() throws Throwable {
        System.out.println("User is logged into Account!");
    }
}
