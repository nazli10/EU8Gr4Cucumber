package com.myProject.stepDef;

import com.myProject.pages.DashboardPage;
import com.myProject.pages.LoginPage;
import com.myProject.pages.QuickLaunchpadPage;
import com.myProject.utilities.ConfigurationReader;
import com.myProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidLogin_StepDef {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    String URL;

    @Then("user copies the URL")
    public void user_copies_the_url(){
        URL = Driver.getDriver().getCurrentUrl();
    }

    @Then("user log out")
    public void user_log_out() throws InterruptedException{
        Thread.sleep(12500);
        quickLaunchpadPage.userDropdown.click();

        Thread.sleep(12500);

        quickLaunchpadPage.logoutButton.click();
    }

    @Then("user paste the URL to the browser")
    public void user_paste_the_url_to_the_browser(){
        Driver.getDriver().get(URL);
    }

    @Then("user clicks login button without providing credentials")
    public void user_clicks_login_button_without_providing_credentials() throws InterruptedException{

        loginPage.loginButton.click();
    }

    @Then("user can not land on {string}")
    public void user_can_not_land_on(String string) throws InterruptedException {

        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @When("user clicks login button without providing any credentials")
    public void userClicksLoginButtonWithoutProvidingAnyCredentials() {
        loginPage.loginButton.click();
    }

    @Then("user must see {string} message")
    public void userMustSeeMessage(String string) {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("return arguments[0].validationMessage", loginPage.userNameBox);

        Assert.assertEquals(string, js.executeScript("return arguments[0].validationMessage", loginPage.userNameBox));





    }



}
