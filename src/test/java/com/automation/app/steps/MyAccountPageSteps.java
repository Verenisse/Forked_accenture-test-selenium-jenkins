package com.automation.app.steps;

import com.automation.app.pages.MyAccountPage;

public class MyAccountPageSteps {
	
	public static void goBacktoMainPage() {
		
		MyAccountPage accountPage = new MyAccountPage();
		accountPage.imgLogo.click();
		
	}

}
