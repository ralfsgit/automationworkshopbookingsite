package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LogInPageObject {

    private SelenideElement getEmailFIeld() {
        return $("test");
    }

    private SelenideElement getPassowrdFIeld() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }



    public void enterEmail(String email) {
        getEmailFIeld().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPassowrdFIeld().sendKeys(password);
    }


    public AccountPageObject selectLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }
}
