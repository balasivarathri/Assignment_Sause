package com.sauce.demo.flows;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sauce.demoscipts.ILoginPageScripts;
import com.sauce.demoscripts.impl.LoginPageImpl;
import com.sun.net.httpserver.Authenticator.Retry;

public class LoginPageFlow {
	private ILoginPageScripts loginPage = new LoginPageImpl();

	@BeforeClass
	public void setUp() {
		loginPage.launchApplication();
	}

	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void userLogin() {
		loginPage.loginWithValidCredntials();
	}

}
