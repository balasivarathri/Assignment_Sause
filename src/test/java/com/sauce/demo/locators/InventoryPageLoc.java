package com.sauce.demo.locators;

import org.openqa.selenium.By;

public class InventoryPageLoc {
	private InventoryPageLoc() {
	}

	private static InventoryPageLoc inventoryloc = null;

	/**
	 * Factory method to return this class object.
	 * 
	 * @return loginPage
	 */
	public static InventoryPageLoc getInstance() {
		if (inventoryloc == null) {
			inventoryloc = new InventoryPageLoc();
		}
		return inventoryloc;
	}

	private By backpackHyperlink = By.id("item_4_title_link");
	private By tshirtHyperlink = By.xpath("//a[@id='item_1_title_link']");
	private By oneSieHyperlink = By.xpath("//a[@id='item_2_title_link']");
	private By bikeLightHyperlink = By.xpath("//a[@id='item_0_title_link']");
	private By jacketHyperlink = By.xpath("//a[@id='item_5_title_link']");
	private By redTShitHyperlink = By.xpath("//a[@id='item_3_title_link']");
	private By inventoryName = By.xpath("//div[@class='inventory_details_name']");
	private By inventoryDesc = By.xpath("//div[@class='inventory_details_desc']");
	private By backButton = By.xpath("//button[@class='inventory_details_back_button']");
	private By addToCart = By.xpath("//button[text()='ADD TO CART']");
	private By selectCarticon = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");
	private By selectCheckout = By.xpath("//a[@class='btn_action checkout_button']");
	private By firstName = By.xpath("//input[@id='first-name']");
	private By lastName = By.xpath("//input[@id='last-name']");
	private By postalCode = By.xpath("//input[@id='postal-code']");
	private By continueBotton = By.xpath("//input[@value='CONTINUE']");
	private By finishButton = By.xpath("//a[text()='FINISH']");
	private By Completeheader = By.xpath("//h2[@class='complete-header']");

	public By getBackpackHyperlink() {
		return backpackHyperlink;
	}

	public By getTshirtHyperlink() {
		return tshirtHyperlink;
	}

	public By getOneSieHyperlink() {
		return oneSieHyperlink;
	}

	public By getBikeLightHyperlink() {
		return bikeLightHyperlink;
	}

	public By getJacketHyperlink() {
		return jacketHyperlink;
	}

	public By getRedTShitHyperlink() {
		return redTShitHyperlink;
	}

	public By getinventoryName() {
		return inventoryName;
	}

	public By getinventoryDesc() {
		return inventoryDesc;
	}

	public By getBackButton() {
		return backButton;
	}

	public By getAddToCart() {
		return addToCart;
	}

	public By getSelectCartIcon() {
		return selectCarticon;
	}

	public By getSelectCheckout() {
		return selectCheckout;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getPostalCode() {
		return postalCode;
	}

	public By getContinueBotton() {
		return continueBotton;
	}

	public By getFinishButton() {
		return finishButton;
	}

	public By getCompleteheader() {
		return Completeheader;
	}
}
