package com.pom.test;

import org.testng.annotations.Test;

import com.pom.pages.ContactPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class ContactTest extends WebDriverTestCase{
	
	@Test
	public void  clickContact()
	{
		ContactPage contact=new ContactPage();
		contact.launchPage(null);
		contact.ContactBtn();
	}

}
