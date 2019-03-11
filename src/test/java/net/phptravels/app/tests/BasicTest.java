package net.phptravels.app.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenture.test.ui.WebDriverSteps;

import net.phptravels.app.steps.HomeSearchSteps;
import net.phptravels.app.steps.ResultPageSteps;

public class BasicTest {

	@AfterMethod(alwaysRun = true)
	public synchronized void afterTest() {

		WebDriverSteps.closeTheBrowser();

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeTest() throws IOException {
		WebDriverSteps nav = new WebDriverSteps();
		nav.navigateToApplication("PHP");

	}

	@Test(groups = { "ALLTests", "Home Page" })
	public void testSearchHotel() {
		HomeSearchSteps.searchFor("atl", "06/03/2019", "11/03/2019");
		ResultPageSteps.verifyNewUrl();

	}

	@Test
	public void testVerifyPriceAndButton() {

		HomeSearchSteps.searchFor("atl", "06/03/2019", "11/03/2019");
		ResultPageSteps.validatePriceAndButton();

	}

}
