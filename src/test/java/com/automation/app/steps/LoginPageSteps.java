package com.automation.app.steps;

import com.automation.app.pages.LoginPage;

public class LoginPageSteps {
	
	public static void login() {
		
		LoginPage loginPage = new LoginPage();
		
		System.out.println("Input email");
		loginPage.inputEmailBox.sendKeys("xamdcrownwell@gmail.com");
		System.out.println("Input password");
		loginPage.inputPsswdBox.sendKeys("7496299");
		System.out.println("Click login button");
		loginPage.loginButton.click();
	}

}
