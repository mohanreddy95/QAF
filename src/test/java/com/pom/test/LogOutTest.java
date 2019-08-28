package com.pom.test;

import org.testng.annotations.Test;

import com.pom.pages.FlightConfirmationPage;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class LogOutTest extends WebDriverTestCase {
	
	
	@Test
	public void logOut() {
		
		FlightConfirmationPage LogOut = new FlightConfirmationPage();
		LogOut.launchPage(null);
		LogOut.logOut("guest", "guest");
	}

}
