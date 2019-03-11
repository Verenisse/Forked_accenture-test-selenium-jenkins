package com.automation.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class LoginPage extends WebDriverSession{
	
	public LoginPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
	
	@FindBy(css = "input[id ='email' ]")
	public WebElement inputEmailBox;
	
	@FindBy(css = "input[id ='passwd' ]")
	public WebElement inputPsswdBox;
	
	 @FindBy(css = "button[id='SubmitLogin']")
	 public WebElement loginButton;

}
