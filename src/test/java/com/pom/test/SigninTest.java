package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;


import com.pom.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SigninTest extends WebDriverTestCase {
		@QAFDataProvider (key="Signin.data")
		@Test(description="Taking data on XML file")
		public void testSigin(Map<String , String> data)
		{
			  SigninPage signin = new SigninPage();
			   signin.launchPage(null);
			   signin.signin(data.get("username"), data.get("password"));
			   
		 
			
		}

	}


