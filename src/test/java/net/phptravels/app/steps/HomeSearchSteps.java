package net.phptravels.app.steps;

import com.accenture.test.ui.WaitActions;

import net.phptravels.app.pages.HomePage;

public class HomeSearchSteps {

	public static void searchFor(String strText, String strCheckin, String strCheckout) {

		HomePage homePage = new HomePage();

		System.out.println("Wait for field to be displayed");
		WaitActions.waitForElement(homePage.campoSearchDisabled, 5);
		System.out.println("Click in the field for search");
		homePage.campoSearchDisabled.click();
		// WaitActions.waitForElement(homePage.campoSearchInput, 5);
		System.out.println("Search for " + strText);
		homePage.campoSearchInput.sendKeys(strText);
		System.out.println("Click first option drop down");
		homePage.opcionSelect.click();
		System.out.println("Input Check In " + strCheckin);
		homePage.inputCheckin.sendKeys(strCheckin);
		System.out.println("Input Check out " + strCheckout);
		homePage.inputCheckout.sendKeys(strCheckout);
		System.out.println("Click on Search button");
		homePage.searchButton.click();

	}

}
