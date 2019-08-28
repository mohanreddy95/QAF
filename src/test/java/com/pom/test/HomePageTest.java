package com.pom.test;


import org.testng.annotations.Test;

import com.pom.pages.HomePage;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class HomePageTest extends WebDriverTestCase{
	
	@Test
	public void  homePage()
	{
		 HomePage Home = new HomePage();
		 Home.launchPage(null);
		 Home.homePageVerifcation();
	}
	
}
