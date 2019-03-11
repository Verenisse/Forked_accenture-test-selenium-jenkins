package com.automation.app.steps;

import org.openqa.selenium.interactions.Actions;

import com.accenture.test.ui.WebDriverSession;
import com.automation.app.pages.MainPage;

public class MainPageSteps {
	
	public static void clickCartButton() {
		
		MainPage mainPage = new MainPage();
		
		System.out.println("Click button cart");
		mainPage.cartButton.click();
	}
	
	public static void clickLoginButton() {
		
		MainPage mainPage = new MainPage();
				
		System.out.println("Click login button");
		mainPage.loginButton.click();
	}
	
	public static void clickAddtoCartButtonfromBlouse() {
		
		MainPage mainPage = new MainPage();
		Actions actions = new Actions(WebDriverSession.getWebDriverSession());
		
		System.out.println("Move to blouse item");
		actions.moveToElement(mainPage.imgBlouse).perform();
		System.out.println("click Add to cart button");
		mainPage.addToCartBttuonfromBlouse.click();
				
		
	}
	
	public static void continueShopping() {
		
		MainPage mainPage = new MainPage();
		
		System.out.println("Continue Shopping");
		mainPage.continueShopping.click();
	}

}
