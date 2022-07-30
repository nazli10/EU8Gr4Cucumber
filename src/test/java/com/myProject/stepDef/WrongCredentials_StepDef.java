package com.myProject.stepDef;

import com.myProject.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WrongCredentials_StepDef {

    LoginPage loginPage = new LoginPage();

    @When("user enters {string} or {string}")
    public void user_enters_or(String wrongUsername, String wrongPassword){
        loginPage.userNameBox.sendKeys(wrongUsername);
        loginPage.passwordBox.sendKeys(wrongPassword);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String string) {
        Assert.assertEquals(string,loginPage.messageAfterInvalidCredential.getText());
    }


}
