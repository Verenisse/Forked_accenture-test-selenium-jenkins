package net.phptravels.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class ResultPage extends WebDriverSession {

	public static final String detailsButton = " button.btn-primary";

	public static final String elementPrice = " .fs26.text-center b";

	@FindBy(xpath = "//img[@class = 'pull-right brand img-responsive']")
	public WebElement brand;

	@FindBy(css = ".wow.fadeIn.p-10-0.animated[style*='visibility: visible']")
	public List<WebElement> resultsList;

	public ResultPage() {

		PageFactory.initElements(getWebDriverSession(), this);

	}

}
