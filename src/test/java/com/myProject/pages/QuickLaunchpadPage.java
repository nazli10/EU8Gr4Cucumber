package com.myProject.pages;

import com.myProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickLaunchpadPage {

    public QuickLaunchpadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement quickLaunchpad;

    @FindBy(id = "user-menu")
    public WebElement userDropdown;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logoutButton;





}
