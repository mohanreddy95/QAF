package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.FindAFlightPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class DifferentLocationAndDateTest extends WebDriverTestCase {
	
	@QAFDataProvider(key="data.Flights.user")
	@Test
	public void QAfFlight(Map<String , String> data)
	{
		FindAFlightPage flights=new FindAFlightPage();
		flights.launchPage(null);
		flights.signin("guest", "guest");
		flights.flights(data.get("fromMonth"), data.get("fromDay"), data.get("returningMonth"), data.get("returningDay"),data.get("arriving"),data.get("departing"));
		
	}

}
