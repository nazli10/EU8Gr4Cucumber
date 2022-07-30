package com.myProject.stepDef;


import com.myProject.pages.ForgotPasswordPage;
import com.myProject.pages.LoginPage;
import com.myProject.pages.ForgotPasswordPage;
import com.myProject.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPassword_StepDef {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();


    @When("user clicks Forgot your password? link")
    public void user_clicks_link() {
        loginPage.forgotYourPasswordLink.click();
    }

    @And("user lands on {string} page")
    public void user_lands_on_forgot_password_page(String pageVerifier) {
        Assert.assertEquals(pageVerifier, forgotPasswordPage.forgotPasswordPage.getText());
    }

    @And("user types {string} as username")
    public void userTypesAsUsername(String userName) {
        forgotPasswordPage.userNameInputBox.sendKeys(userName);
    }


    @And("user clicks REQUEST button")
    public void user_clicks_button() {
        forgotPasswordPage.requestButton.click();
    }

    @Then("user changes his or her password")
    public void user_changes_his_him_password() {

        Assert.assertFalse(forgotPasswordPage.warningMessage.isDisplayed());
    }




}