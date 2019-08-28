package com.pom.test;

import org.testng.annotations.Test;

import com.pom.pages.RegisterBeanPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class RegisterBeanTest extends WebDriverTestCase {
	@Test
	public void registerNewUser() {
		
		RegisterBeanPage register=new RegisterBeanPage();
		register.launchPage(null);
		register.registerUser();
		
	}

}
