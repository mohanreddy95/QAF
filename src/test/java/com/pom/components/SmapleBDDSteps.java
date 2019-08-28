package com.pom.components;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class SmapleBDDSteps {
	@QAFTestStep(description="user open new tour app")
	public void openApp() {
		CommonStep.get("/");
		
	}
	@QAFTestStep(description="user login with valid {0} and valid {1}")
	public void doLogin(String username , String password)
	{
		//CommonStep.waitForPresent("signin.username.text");
		CommonStep.sendKeys(username,"signin.username.text");
		CommonStep.sendKeys(password, "signin.password.text");
		CommonStep.click("signin.singin.btn");
	}
	@QAFTestStep(description="verify home page id diplayed")
	public void verifysuccess()
	{
		Reporter.log("login successfully");
	}

}
