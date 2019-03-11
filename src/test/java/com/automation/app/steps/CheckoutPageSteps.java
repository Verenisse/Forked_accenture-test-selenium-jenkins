package com.automation.app.steps;

import org.testng.asserts.SoftAssert;

import com.accenture.test.ui.Checkpoints;
import com.accenture.test.ui.WaitActions;
import com.automation.app.pages.CheckooutPage;

public class CheckoutPageSteps {
	
	public static void buyTheItem() {
		
		CheckooutPage checkout = new CheckooutPage();
		SoftAssert softAssert = new SoftAssert();
		
		WaitActions.waitForElement(checkout.proceedButton, 3);
		System.out.println("Validar el objeto del carrito");
		softAssert.assertTrue(Checkpoints.inString(checkout.imgCartBlouse.getAttribute("alt"), "Blouse"));
		checkout.proceedButton.click();
		System.out.println("Continuar a direccion...");
		WaitActions.waitForElement(checkout.processAddressButton, 3);
		checkout.processAddressButton.click();
		System.out.println("Continuar a envios...");
		WaitActions.waitForElement(checkout.processCarrierButton, 3);
		checkout.termsCheckBox.click();
		checkout.processCarrierButton.click();
		System.out.println("Continuar a metodos de pago...");
		WaitActions.waitForElement(checkout.bankWire, 3);
		checkout.bankWire.click();
		System.out.println("Confirmar pago...");
		WaitActions.waitForElement(checkout.headerPayment, 3);
		softAssert.assertTrue(Checkpoints.inString(checkout.headerPayment.getText(), "BANK-WIRE"));
		checkout.confirmPaymentButton.click();
		softAssert.assertTrue(Checkpoints.inString(checkout.confirmationText.getText(), "is complete"));
		
		
	}

}
