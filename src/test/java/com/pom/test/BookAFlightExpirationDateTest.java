package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.BookAFlightPage;
import com.pom.pages.SigninPage;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BookAFlightExpirationDateTest extends WebDriverTestCase {
	@QAFDataProvider(key="data.ExpirationDate.user")
	@Test(description=" ExpirationDateField giving data on xml file ")
	public void expirationDateField(Map<String , String>data)
	{
		BookAFlightPage bookAFlight=new BookAFlightPage();
		bookAFlight.launchPage(null);
		new SigninPage().signin("guest", "guest");
		bookAFlight.bookAFlighExpirationField(data.get("month"), data.get("year"));
	}

}
