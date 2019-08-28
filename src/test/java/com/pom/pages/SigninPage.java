package com.pom.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class SigninPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "signin.username.text")
	private QAFWebElement userNameField;
	@FindBy(locator = "signin.password.text")
	private QAFWebElement PasswordField;
	@FindBy(locator = "signin.singin.btn")
	private QAFWebElement signinBtn;
	public QAFWebElement getUserNameField() {
		return userNameField;
	}
	public QAFWebElement getPasswordField() {
		return PasswordField;
	}
	public QAFWebElement getSigninBtn() {
		return signinBtn;
	}
	public void signin(String username, String password) {
		waitForPageToLoad();
		
		getUserNameField().sendKeys(username);
		getPasswordField().sendKeys(password);
		getSigninBtn().click();
		String actualTitle = driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("Find a Flight"), "Click on Signin button system should not  navigate to FindaFlight page",
                "Click on Signin button system should navigate to Find a Flight page successfully");
		Reporter.log("user is able to sign in successfully ");
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}
