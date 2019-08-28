package com.pom.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	@FindBy(locator="homepage.featureddesctination.img")
	private QAFWebElement featuredDesctination;
	@FindBy(locator="homepage.speciol.img")
	private QAFWebElement speciol;
	@FindBy(locator="homepage.tourtips.img")
	private QAFWebElement tourTips;
	@FindBy(locator="homepage.findafilght.img")
	private QAFWebElement findAFilght;
	@FindBy (locator="homepage.destination.link")
	private QAFWebElement destination;
	@FindBy(locator="homepage.vacations.link")
	private QAFWebElement vacations;
	@FindBy (locator="homepage.register.img")
	private QAFWebElement register;
	@FindBy(locator="homepage.links.img")
	private QAFWebElement links;
	public void homePageVerifcation()
	{
		
		Validator.verifyTrue(featuredDesctination.isPresent(), "featuredDesctination components is not present in home page",
				"featuredDesctination components is present in home page");
		Validator.verifyTrue(speciol.isPresent(), "speciol components is not present in home page", 
				"speciol components is present in home page");
		Validator.verifyTrue(tourTips.isPresent(), "tourTips components is not presentin home page", 
				"tourTips components is present in home page");
		Validator.verifyTrue(findAFilght.isPresent(), "findAFilght components is not present in home page",
				"findAFilght components is present in home page");
		Validator.verifyTrue(destination.isPresent(), "destination link is not present in home page", 
				"destination link is present in home page");
		Validator.verifyTrue(destination.isPresent(), "vacations link is not present in home page", "vacations link is present in home page");
		Validator.verifyTrue(findAFilght.isPresent(), "registe components is not present in home page", "registe components is present in home page");
		Validator.verifyTrue(findAFilght.isPresent(), "links components is not present ", "links components is present in home page");
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
		
	}

}
