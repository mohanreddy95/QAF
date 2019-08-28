package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.BookAFlightPage;
import com.pom.pages.SigninPage;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BookAFlighFieldTest extends WebDriverTestCase {
	@QAFDataProvider(key="data.bookFlight.user")
	@Test
	public void validation(Map<String, String> data)
	{
		BookAFlightPage validation=new BookAFlightPage();
		validation.launchPage(null);
		new SigninPage().signin(data.get("username"),data.get("password"));
		validation.bookAFlighValidationsFields(data.get("firstname"),data.get("lasename"));
	}

}
