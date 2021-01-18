package com.sauce.demo.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sauce.demoscipts.ICommonActions;

public class CommonActions implements ICommonActions {

	private static WebDriver webDriver;
	String chromebrowserkey = "webdriver.chrome.driver";
	String chromebrowserpathvalue = "..//demo/Drivers/chromedriver.exe";

	public WebDriver getWebDriver() {
		return webDriver;
	}

	/**
	 * Initializing webdriver.
	 * 
	 * @param webDriver {@link WebDriver}
	 */

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	/**
	 * Waits until the element is loaded and returns it.
	 */
	public WebElement getElement(By criteria) {
		try {
			org.openqa.selenium.support.ui.Sleeper.SYSTEM_SLEEPER.sleep(new Duration(500, TimeUnit.MILLISECONDS));
			return new WebDriverWait(webDriver, 3).until(ExpectedConditions.presenceOfElementLocated(criteria));
		} catch (TimeoutException exception) {
			return null;
		} catch (Exception exception) {
			return null;
		}
	}

	public void launchApplication() {

		System.setProperty(chromebrowserkey, chromebrowserpathvalue);
		webDriver = new ChromeDriver();
		webDriver.get("https://www.saucedemo.com/");
		webDriver.manage().window().maximize();

	}

	public void closeBrowser() {
		webDriver.close();
	}

	public void navigateback() {
		webDriver.navigate().back();
	}

	public WebElement findElement(By xpath, WebDriver webDriver) {
		WebElement element = null;
		try {
			element = webDriver.findElement(xpath);
		} catch (NoSuchElementException e) {
			element = null;
		}

		return element;
	}

}
