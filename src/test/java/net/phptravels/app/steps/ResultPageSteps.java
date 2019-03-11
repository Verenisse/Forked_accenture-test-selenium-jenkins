package net.phptravels.app.steps;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.accenture.test.ui.Checkpoints;
import com.accenture.test.ui.WaitActions;
import com.accenture.test.ui.WebDriverSession;

import net.phptravels.app.pages.ResultPage;

public class ResultPageSteps {

	public static WebElement getButtonFromElement(WebElement iElement) {

		return ResultPage.getWebDriverSession().findElement(By.cssSelector(ResultPage.detailsButton));
	}

	public static WebElement getPriceFromElement(WebElement iElement) {

		return ResultPage.getWebDriverSession().findElement(By.cssSelector(ResultPage.elementPrice));
	}

	public static WebElement getRandomItemFromList() {

		Random random = new Random();
		int index = random.nextInt(getResultsList().size());
		return getResultsList().get(index);
	}

	private static List<WebElement> getResultsList() {

		ResultPage resultPage = new ResultPage();
		return resultPage.resultsList;
	}

	public static void validatePriceAndButton() {

		SoftAssert softAssert = new SoftAssert();
		WebElement element = getRandomItemFromList();
		Assert.assertFalse(getResultsList().isEmpty());
		softAssert.assertTrue(Checkpoints.elementDisplayed(getButtonFromElement(element)));
		softAssert.assertTrue(Checkpoints.elementDisplayed(getPriceFromElement(element)));
		softAssert.assertAll();

	}

	public static void verifyNewUrl() {

		ResultPage resultPage = new ResultPage();
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Wait for element");
		WaitActions.waitForElement(resultPage.brand, 5);
		System.out.println("Verifing current url");
		softAssert.assertTrue(
				Checkpoints.inString(WebDriverSession.getWebDriverSession().getCurrentUrl(), "hotels/search"));

	}

}
