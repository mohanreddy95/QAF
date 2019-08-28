package com.pom.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.pom.pages.RegisterBeanPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class RegisterInvalidDataTest extends WebDriverTestCase {

	@QAFDataProvider(dataFile="resources/TestData/InvalidRegister.xls",sheetName="InvalidRegister",key="InvalidRegister")
	@Test(description=" register the invalid data taken on xls file ")
	public void registerInvalidData(Map<String , String > data)
	{
		RegisterBeanPage Register=new RegisterBeanPage();
		  Register.launchPage(null);
	      Register.invalidRegister(data.get("firstname"), data.get("lastname"),data.get("phone"),data.get("email"));
	}
}
