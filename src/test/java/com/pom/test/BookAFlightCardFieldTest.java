package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.BookAFlightPage;
import com.pom.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BookAFlightCardFieldTest extends WebDriverTestCase{
	
	@QAFDataProvider(key="data.cardNumber.user")
	@Test(description=" verify the cardfield")
	public void cardField(Map<String , String > data)
	{
		BookAFlightPage bookAFlight=new BookAFlightPage();
		bookAFlight.launchPage(null);
		new SigninPage().signin(data.get("username"), data.get("password"));
		bookAFlight.bookAFlighCardNumberField(data.get("creditNumber"));
	}

}
