package com.myProject.pages;

import com.myProject.utilities.Driver;
import com.myProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebElement pages;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "prependedInput")
    public WebElement userNameBox;

    @FindBy (id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy (linkText = "Forgot your password?")
    public WebElement forgotYourPasswordLink;

    @FindBy (xpath = "//div[.='Invalid user name or password.']")
    public WebElement messageAfterInvalidCredential;




}
