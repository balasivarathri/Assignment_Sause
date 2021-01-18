package com.sauce.demoscripts.impl;

import org.openqa.selenium.WebDriver;

import com.sauce.demo.actions.CommonActions;
import com.sauce.demo.actions.Sleeper;
import com.sauce.demo.actions.Sleeper.SleepTime;
import com.sauce.demo.locators.LoginPageLoc;
import com.sauce.demoscipts.ILoginPageScripts;

public class LoginPageImpl extends CommonActions implements ILoginPageScripts {

	private LoginPageLoc loginloc = LoginPageLoc.getInstance();

	@Override
	public void loginWithValidCredntials() {
		getElement(loginloc.getUserName()).sendKeys("standard_user");
		getElement(loginloc.getPassword()).sendKeys("secret_sauce");
		getElement(loginloc.getLoginButton()).click();
		Sleeper.sleepTight(SleepTime.sleepTimeLeast);

	}
}
