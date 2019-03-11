package com.automation.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class CheckooutPage extends WebDriverSession{
	
	public CheckooutPage() {

	        PageFactory.initElements(getWebDriverSession(), this);

	    }
	
	@FindBy(css = "img[alt = 'Blouse'][height = '98']")
	public WebElement imgCartBlouse;
	
	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium']")
	public WebElement proceedButton;
	
	@FindBy(css = "button[name='processAddress']")
	public WebElement processAddressButton;
	
	@FindBy(css = "button[name='processCarrier']")
	public WebElement processCarrierButton;
	
	@FindBy(css = "input[type = 'checkbox'][id = 'cgv']")
	public WebElement termsCheckBox;
	
	@FindBy(css = "a[class='bankwire']")
	public WebElement bankWire;
	
	@FindBy(css = "h3[class = 'page-subheading']")
	public WebElement headerPayment;
	
	@FindBy(css = "button[class = 'button btn btn-default button-medium']")
	public WebElement confirmPaymentButton;
	
	@FindBy(css = "p[class='cheque-indent'] strong")
	public WebElement confirmationText;

}
