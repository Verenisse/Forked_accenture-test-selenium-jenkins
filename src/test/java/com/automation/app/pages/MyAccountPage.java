package com.automation.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class MyAccountPage extends WebDriverSession{
	
	public MyAccountPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
	
	@FindBy(css = "img[class='logo img-responsive']")
	public WebElement imgLogo;

}
