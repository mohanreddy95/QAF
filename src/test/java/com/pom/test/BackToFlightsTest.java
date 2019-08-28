package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;


import com.pom.pages.FlightConfirmationPage;
import com.pom.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BackToFlightsTest extends WebDriverTestCase{
	@QAFDataProvider(key="Signin.data")
	@Test
		public void backToFlight(Map<String , String >data)
		{
		FlightConfirmationPage backToFlight=new FlightConfirmationPage();
		backToFlight.launchPage(null);
		new SigninPage().signin(data.get("username"), data.get("password"));
		backToFlight.Navigation();
		
	}

}
