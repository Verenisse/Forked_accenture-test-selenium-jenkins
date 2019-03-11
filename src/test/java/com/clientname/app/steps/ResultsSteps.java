package com.clientname.app.steps;

import org.testng.asserts.SoftAssert;

import com.accenture.test.ui.Checkpoints;
import com.accenture.test.ui.WaitActions;
import com.clientname.app.pages.ResultsPage;

import cucumber.api.java.en.Then;

public class ResultsSteps {
	 
	//**********************************************************
	//**********************************************************
	//This steps should be moved to a ResultsSteps
	@Then("Check the tabs displayed in results page" )	
    public static void checkTabsInResult() {
		ResultsPage resultsPage = new ResultsPage();
		SoftAssert softAssert = new SoftAssert();	
		System.out.println("Start: Check Results Record: ");	
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabTodos));
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabNoticias));
        //softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabImagenes));
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabVideos));
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabLibros));
        //softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabMas));
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabPref));
        softAssert.assertTrue(Checkpoints.elementDisplayed(resultsPage.tabHerramientas));
        softAssert.assertAll();

    }
	
	@Then("Click on the Videos tab" )	
    public static void clickVideosTabInResult() {
		ResultsPage resultsPage = new ResultsPage();
		System.out.println("Start: Check Results Record: ");	
		WaitActions.waitForElement(resultsPage.tabVideos, 10);
		resultsPage.tabVideos.click();
    }
	
}
