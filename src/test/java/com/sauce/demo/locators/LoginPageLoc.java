package com.sauce.demo.locators;

import org.openqa.selenium.By;

public class LoginPageLoc {

	private LoginPageLoc() {
	}

	private static LoginPageLoc loginPage = null;

	/**
	 * Factory method to return this class object.
	 * 
	 * @return loginPage
	 */
	public static LoginPageLoc getInstance() {
		if (loginPage == null) {
			loginPage = new LoginPageLoc();
		}
		return loginPage;
	}

	private By userNameTextBox = By.id("user-name");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.id("login-button");

	/**
	 * Enter UserName
	 * 
	 * @return the userNameTextBox
	 */
	public By getUserName() {
		return userNameTextBox;
	}

	/**
	 * Enter Password
	 * 
	 * @return the passwordTextBox
	 */
	public By getPassword() {
		return passwordTextBox;
	}

	/**
	 * Select Login Button
	 * 
	 * @return the loginButton
	 */
	public By getLoginButton() {
		return loginButton;
	}
}
