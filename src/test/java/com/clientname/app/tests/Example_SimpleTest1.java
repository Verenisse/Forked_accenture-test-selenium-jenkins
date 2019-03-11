package com.clientname.app.tests;

import com.accenture.test.ui.WebDriverSteps;
import com.clientname.app.steps.ResultsSteps;
import com.clientname.app.steps.SearchSteps;
import java.io.IOException;
import org.testng.annotations.*;
/**
 ****************************************************************************
 *HIGHLIGHTS:
 * > SCRIPT NAME:
 * > DESCRIPTION:
 * > DATA:
 ****************************************************************************
 */
public class Example_SimpleTest1 {

 @BeforeMethod (alwaysRun = true)
 public void beforeTest() throws IOException { 
	WebDriverSteps nav = new WebDriverSteps();
	nav.navigateToApplication("GOOGLE");

 }
	
 @Test (groups = {"ALLTests", "Test1", "Smoke"})
  public void testGoogleSearch() {
	 SearchSteps.searchFor("Test");
	 ResultsSteps.checkTabsInResult();
	 WebDriverSteps.closeTheBrowser(); 
	 
 }
  
 @Test (groups = {"ALLTests","Test2"})
  public void testGoogleSearch2() {

	 SearchSteps.searchFor("Test");
	 ResultsSteps.clickVideosTabInResult();
	 WebDriverSteps.closeTheBrowser();
	  
  }

  
 @AfterMethod(alwaysRun = true)
  public void afterTest() {

  }
 
 
}
