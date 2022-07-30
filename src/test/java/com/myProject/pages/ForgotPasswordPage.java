package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    public ForgotPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Forgot Password']")
    public WebElement forgotPasswordPage;

    @FindBy(id = "prependedInput")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement requestButton;

    @FindBy(xpath = "//div[@class='alert alert-warn']")
    public WebElement warningMessage;


}
