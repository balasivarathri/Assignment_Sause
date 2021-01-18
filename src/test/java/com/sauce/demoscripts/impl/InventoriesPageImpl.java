package com.sauce.demoscripts.impl;

import org.testng.Assert;

import com.sauce.demo.actions.CommonActions;
import com.sauce.demo.actions.Sleeper;
import com.sauce.demo.actions.Sleeper.SleepTime;
import com.sauce.demo.locators.InventoryPageLoc;
import com.sauce.demoscipts.IInventoryPageScripts;

public class InventoriesPageImpl extends CommonActions implements IInventoryPageScripts {

	private InventoryPageLoc invLoc = InventoryPageLoc.getInstance();

	public InventoriesPageImpl() {

	}

	public void verifySauceLabsBackpack() {
		String inventiryName = "Sauce Labs Backpack";
		String inventoryDesc = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		System.out.println(invLoc.getBackpackHyperlink());
		getElement(invLoc.getBackpackHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void verifySauceLabsBoltTShirt() {
		// TODO Auto-generated method stub
		String inventiryName = "Sauce Labs Bolt T-Shirt";
		String inventoryDesc = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getTshirtHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void verifySauceLabsOnesie() {
		// TODO Auto-generated method stub
		String inventiryName = "Sauce Labs Onesie";
		String inventoryDesc = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
		getElement(invLoc.getOneSieHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void verifySauceLabsBikeLight() {
		// TODO Auto-generated method stub
		String inventiryName = "Sauce Labs Bike Light";
		String inventoryDesc = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
		getElement(invLoc.getBikeLightHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void verifySauceLabsFleeceJacket() {
		// TODO Auto-generated method stub
		String inventiryName = "Sauce Labs Fleece Jacket";
		String inventoryDesc = "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
		getElement(invLoc.getJacketHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void verifyTestallTheThingsTShirtRed() {
		// TODO Auto-generated method stub
		String inventiryName = "Test.allTheThings() T-Shirt (Red)";
		String inventoryDesc = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
		getElement(invLoc.getRedTShitHyperlink()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		Assert.assertEquals(getTitle(), inventiryName);
		Assert.assertEquals(getDescription(), inventoryDesc);
		getElement(invLoc.getBackButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}

	@Override
	public void ValidateRedTShit() {
		// TODO Auto-generated method stub
		getElement(invLoc.getAddToCart()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getSelectCartIcon()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getSelectCheckout()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getFirstName()).sendKeys("ABCED");
		getElement(invLoc.getLastName()).sendKeys("NBCHVH");
		getElement(invLoc.getPostalCode()).sendKeys("123456");
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getContinueBotton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);
		getElement(invLoc.getFinishButton()).click();
		String completeheader = getElement(invLoc.getCompleteheader()).getText();
		String header = "THANK YOU FOR YOUR ORDER";
		Assert.assertEquals(header, completeheader);
	}

	public String getTitle() {
		String Title = getElement(invLoc.getinventoryName()).getText();
		return Title;
	}

	public String getDescription() {
		String desc = getElement(invLoc.getinventoryDesc()).getText();
		return desc;
	}

}
