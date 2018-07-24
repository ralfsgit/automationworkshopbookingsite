package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameFIeld() {
        return $("test");
    }

    private SelenideElement getLastNameFIeld() {
        return $("test");
    }

    private SelenideElement getMobileNumerFIeld() {
        return $("test");
    }

    private SelenideElement getEmailFIeld() {
        return $("test");
    }

    private SelenideElement getPassowrdFIeld() {
        return $("test");
    }

    private SelenideElement getConfirmPassowrdFIeld() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String firstName) {
        getFirstNameFIeld().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameFIeld().sendKeys(lastName);
    }

    public void enterMobileNumber(String mobileNumber) {
        getMobileNumerFIeld().sendKeys(mobileNumber);
    }

    public void enterEmail(String email) {
        getEmailFIeld().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPassowrdFIeld().sendKeys(password);
    }

    public void enterConfirmationPassword(String password) {
        getConfirmPassowrdFIeld().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
