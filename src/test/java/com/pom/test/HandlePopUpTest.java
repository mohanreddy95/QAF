package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.BookAFlightPage;
import com.pom.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class HandlePopUpTest extends WebDriverTestCase{
	@QAFDataProvider(key="Signin.data")
	@Test(description=" verify popup message dispaly")
	public void Countryfield(Map<String , String >data) {
		BookAFlightPage verifyPopUp=new BookAFlightPage();
		verifyPopUp.launchPage(null);
		new SigninPage().signin(data.get("username"), data.get("password"));
		verifyPopUp.bookAFlightCountryField();
		
		
	}

}
