package com.automation.app.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.test.ui.WebDriverSteps;
import com.automation.app.steps.LoginPageSteps;
import com.automation.app.steps.MainPageSteps;
import com.automation.app.steps.MyAccountPageSteps;

public class BasicTest2 {

	@AfterMethod(alwaysRun = true)
	public void afterTest() {

		WebDriverSteps.closeTheBrowser();

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeTest() throws IOException {
		WebDriverSteps nav = new WebDriverSteps();
		nav.navigateToApplication("STORE");
	}

	@Test
	public void loginTest() {

		MainPageSteps.clickLoginButton();
		LoginPageSteps.login();
		MyAccountPageSteps.goBacktoMainPage();

	}

}
