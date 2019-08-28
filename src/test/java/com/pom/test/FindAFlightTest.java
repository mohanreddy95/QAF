package com.pom.test;

import org.testng.annotations.Test;

import com.pom.beans.FlightFinderBean;
import com.pom.pages.FindAFlightPage;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class FindAFlightTest extends WebDriverTestCase{

    @Test
    public void flights()  {
    	FindAFlightPage flight =new FindAFlightPage();
    	flight.launchPage(null);
    	flight.signin("guest", "guest");
    	flight.flightBookingPage();
    	flight.flightSelectPage();
    	flight.bookingFlight();
    
    }
}
