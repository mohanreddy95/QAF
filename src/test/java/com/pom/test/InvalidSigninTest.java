package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class InvalidSigninTest extends WebDriverTestCase {
	
	 
	 @QAFDataProvider (key="InvalidSignin.data")
		@Test(description="XML Data")
		public void testSigin(Map<String , String> data) throws InterruptedException
		{
		 SigninPage invalidData=new SigninPage();
	     invalidData.launchPage(null);
	     invalidData.signin(data.get("username"),data.get("password"));
		}

}
