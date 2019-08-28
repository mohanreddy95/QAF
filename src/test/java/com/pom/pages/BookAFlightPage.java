package com.pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class BookAFlightPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy(locator="flight.findflight.btn")
	private QAFWebElement continueBtn;
	@FindBy(locator="flight.reserveflights.btn")
	private QAFWebElement reserveFlightsBtn;
	@FindBy(locator="bookingflight.secureparchase.btn")
	private QAFWebElement secureparchaseBtn;
	@FindBy(locator="bookingflight.firstname.text")
	private QAFWebElement firstNamefield;
	@FindBy(locator="bookingflight.lastname.text")
	private QAFWebElement lastNamefield;
	@FindBy(locator="bookingflight.delcountry.text")
	private QAFWebElement delCountry;
	public QAFWebElement getDelCountry() {
		return delCountry;
	}
	@FindBy(locator="bookingflight.month.text")
	private QAFWebElement monthField;
	public QAFWebElement getMonthField() {
		return monthField;
	}
	public QAFWebElement getYearField() {
		return yearField;
	}
	@FindBy(locator="bookingflight.year.text")
	private QAFWebElement yearField;
	@FindBy(locator="bookingflight.creditnumber.text")
	private QAFWebElement cardField;

	public QAFWebElement getCardField() {
		return cardField;
	}

	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	public QAFWebElement getReserveFlightsBtn() {
		return reserveFlightsBtn;
	}
	public QAFWebElement getSecureparchaseBtn() {
		return secureparchaseBtn;
	}
	public QAFWebElement getfirstNamefield() {
		return firstNamefield;
	}
	public QAFWebElement getlastNamefield() {
		return lastNamefield;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.manage().window().maximize();
		driver.get("/");
	}
	public void bookAFlighValidationsFields(String firstname,String lasename) {
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		getfirstNamefield().sendKeys(firstname);
		getlastNamefield().sendKeys(lasename);
		Reporter.log("Enter invalid data in userName and PassWord Field");
		getSecureparchaseBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("Flight Confirmation"), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
                "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
		Reporter.log(" it showing all details should be displayed as per the details selected");
	}
	public void bookAFlighExpirationField(String month,String year)
	{

	 getContinueBtn().click();
	 getReserveFlightsBtn().click();
	 getMonthField().sendKeys(month);
	 getYearField().sendKeys(year);
	 String actualTitle=driver.getTitle();
	 Validator.verifyTrue(actualTitle.contains("Flight Confirmation"), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
             "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
	 Reporter.log("User is navigate to Flight Confirmation page successfully");
	 getSecureparchaseBtn().click();
	}
	public void bookAFlighCardNumberField(String cardNumber)
	{
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		getCardField().sendKeys(cardNumber);
		Reporter.log("user verify the cardfield  ");
		getSecureparchaseBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("Flight Confirmation"), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
                "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
		Reporter.log(" it is navigating to Flight Confirmation page successfully");
		
	}
	public void bookAFlightCountryField() {
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		Select selectDropDwon = new Select(delCountry);
		selectDropDwon .selectByVisibleText("AUSTRALIA");
		Alert alert= driver.switchTo().alert();
		String alertMsg= alert.getText();
		Reporter.log(" popup is coming and this is the message:"+alertMsg);
		alert.accept();
		Reporter.log("after selecting the country");
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("Flight Confirmation"), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
                "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
		getSecureparchaseBtn().click();
	}
}
