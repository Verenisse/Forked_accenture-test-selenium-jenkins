package com.automation.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class MainPage extends WebDriverSession{
	
	public MainPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }

	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=order'][title='View my shopping cart']")
	public WebElement cartButton;
	
	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=my-account'][class = 'login']")
	public WebElement loginButton;
	
	@FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=2&token=90dfea481c263bfaa91c3b0d830da122']")
	public WebElement addToCartBttuonfromBlouse;
	
	@FindBy(css = "span[class='continue btn btn-default button exclusive-medium']")
	public WebElement continueShopping;
	
	@FindBy(css = "div[class = 'product-image-container'] a[class = 'product_img_link'][title = 'Blouse'][href='http://automationpractice.com/index.php?id_product=2&controller=product'] img[alt = 'Blouse']")
	public WebElement imgBlouse;

}
