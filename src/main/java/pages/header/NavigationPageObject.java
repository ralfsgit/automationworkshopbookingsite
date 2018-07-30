package pages.header;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.login.LogInPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    //private SelenideElement myAccountButton = $("test"); --- iekashos elementu, ja katru reizi mainis, labak metodi rakstit.


    private SelenideElement getMyAccountButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }

    public void selectMyAccountButton() {
        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LogInPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LogInPageObject.class);
    }

}
