package com.sauce.demo.flows;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sauce.demoscipts.IInventoryPageScripts;
import com.sauce.demoscripts.impl.InventoriesPageImpl;
import com.sun.net.httpserver.Authenticator.Retry;

public class InventoryPageFlow {
	private IInventoryPageScripts inventoryflow = new InventoriesPageImpl();

	/**
	 * This method is to perform all the actions on Sauce Labs Backpack item
	 */

	@Test(priority = 1)
	public void verifySauceLabsBackpack() {
		inventoryflow.verifySauceLabsBackpack();
	}

	@Test(priority = 2)
	public void verifySauceLabsBoltTShirt() {
		inventoryflow.verifySauceLabsBoltTShirt();
	}

	@Test(priority = 3)
	public void verifySauceLabsOnesie() {
		inventoryflow.verifySauceLabsOnesie();
	}

	@Test(priority = 4)
	public void verifySauceLabsBikeLight() {
		inventoryflow.verifySauceLabsBikeLight();
	}

	@Test(priority = 5)
	public void verifySauceLabsFleeceJacket() {
		inventoryflow.verifySauceLabsFleeceJacket();
	}

	@Test(priority = 7)
	public void verifyTestallTheThingsTShirtRed() {
		inventoryflow.verifyTestallTheThingsTShirtRed();
	}

	@Test(priority = 8)
	public void ValidateRedTShit() {
		inventoryflow.ValidateRedTShit();

	}
}
