package com.pom.test;

import org.testng.annotations.Test;

import com.pom.pages.FindAFlightPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SameLocationsTest extends WebDriverTestCase{
	
	@Test
	public void flightFinderPage() 
	{
		FindAFlightPage finder=new FindAFlightPage();
		finder.launchPage(null);
		finder.signin("guest", "guest");
		finder.sameLocations();
	}

}
