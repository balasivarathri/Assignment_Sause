package com.sauce.demo.actions;

import org.openqa.selenium.support.ui.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Wrapper class for Thread.sleep.
 * 
 * @author bala.siva
 *
 */
public class Sleeper {

	private static final Logger log = LoggerFactory.getLogger(Sleeper.class);

	private Sleeper() {

	}

	public enum SleepTime {
		sleepTimeVeryHigh, sleepTimeHigh, sleepTimeMedium, sleepTimeLow, sleepTimeLeast, sleepTimeVeryLeast,
		sleepTimeForPost,
	}

	private static final org.openqa.selenium.support.ui.Sleeper sleeper = org.openqa.selenium.support.ui.Sleeper.SYSTEM_SLEEPER;

	private static final Duration sleepTimeVeryHigh = new Duration(20L, TimeUnit.SECONDS);
	private static final Duration sleepTimeHigh = new Duration(15L, TimeUnit.SECONDS);
	private static final Duration sleepTimeMedium = new Duration(13L, TimeUnit.SECONDS);
	private static final Duration sleepTimeLow = new Duration(8L, TimeUnit.SECONDS);
	private static final Duration sleepTimeLeast = new Duration(5L, TimeUnit.SECONDS);
	private static final Duration sleepTimeVeryLeast = new Duration(3L, TimeUnit.SECONDS);
	private static final Duration sleepTimeForPost = new Duration(12L, TimeUnit.SECONDS);

	/**
	 * Sleeps the running thread for given time.
	 * 
	 * @param sleepTime sleepTime.
	 */
	public static void sleepTight(SleepTime sleepTime) {
		try {
			switch (sleepTime) {
			case sleepTimeVeryHigh:
				sleeper.sleep(sleepTimeVeryHigh);
				break;
			case sleepTimeHigh:
				sleeper.sleep(sleepTimeHigh);
				break;
			case sleepTimeMedium:
				sleeper.sleep(sleepTimeMedium);
				break;
			case sleepTimeLow:
				sleeper.sleep(sleepTimeLow);
				break;
			case sleepTimeLeast:
				sleeper.sleep(sleepTimeLeast);
				break;
			case sleepTimeVeryLeast:
				sleeper.sleep(sleepTimeVeryLeast);
				break;
			case sleepTimeForPost:
				sleeper.sleep(sleepTimeForPost);
				break;
			default:
				break;
			}
		} catch (InterruptedException e) {
			log.error("failed to sleep", e);
		}
	}

}
