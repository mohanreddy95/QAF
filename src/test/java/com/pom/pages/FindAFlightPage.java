package com.pom.pages;


import java.util.List;

import com.pom.beans.BookingFlightBean;
import com.pom.beans.FlightFinderBean;
import com.pom.components.SelectPageComponent;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class FindAFlightPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="signin.username.text")
	private QAFWebElement username;
	@FindBy(locator="signin.password.text")
	private QAFWebElement password;
	@FindBy (locator="signin.singin.btn")
	private QAFWebElement signin;
	@FindBy(locator="flight.flight.link")
	private QAFWebElement flightLink;
	@FindBy(locator="flight.roundtrip.rbtn")
	private QAFWebElement roundTrip;
	@FindBy(locator="flight.passengers.text")
	private QAFWebElement passengers;
	@FindBy(locator="flight.departing.text")
	private QAFWebElement departing;
	@FindBy(locator="flight.frommonth.text")
	private QAFWebElement fromMonth;
	@FindBy(locator="flight.formday.text")
	private QAFWebElement fromDay;
	@FindBy(locator="flight.arriving.text")
	private QAFWebElement arriving;
	@FindBy(locator="flight.returningmonth.text")
	private QAFWebElement returningMonth;
	@FindBy(locator="flight.returningday.text.text")
	private QAFWebElement returningDay;
	@FindBy(locator="flight.findflight.btn")
	private QAFWebElement continueBtn;
	@FindBy(locator="flight.selectflightdepart.rbtn")
	private QAFWebElement selectFlightDepart;
	@FindBy(locator="flight.selectflightreturn.rbtn")
	private QAFWebElement selectFlightReturn;
	@FindBy(locator="flight.reserveflights.btn")
	private QAFWebElement reserveFlightsBtn;
	@FindBy(locator="bookingflight.secureparchase.btm")
	private QAFWebElement secureparchaseBtn;
	public QAFWebElement getUsername() {
		return username;
	}
	public QAFWebElement getPassword() {
		return password;
	}
	public QAFWebElement getSignin() {
		return signin;
	}
	public QAFWebElement getSecureparchaseBtn() {
		return secureparchaseBtn;
	}
	public QAFWebElement getFlightLink() {
		return flightLink;
	}
	public QAFWebElement getRourdTrip() {
		return roundTrip;
	}
	public QAFWebElement getPassengers() {
		return passengers;
	}
    public QAFWebElement getDeparting() {
		return departing;
	}
   public QAFWebElement getFromMonth() {
		return fromMonth;
	}
	public QAFWebElement getFromDay() {
		return fromDay;
	}
	public QAFWebElement getArriving() {
		return arriving;
	}
	public QAFWebElement getReturningMonth() {
		return returningMonth;
	}
	public QAFWebElement getReturningDay() {
		return returningDay;
	}
	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	public QAFWebElement getReserveFlightsBtn() {
		return reserveFlightsBtn;
	}
	public QAFWebElement getSelectFlightDepart() {
		return selectFlightDepart;
	}
	public QAFWebElement getSelectFlightReturn() {
		return selectFlightReturn;
	}
	@FindBy(locator="selectflight.flighttable.fid")
	List<SelectPageComponent> componentElements;
	
	public List<SelectPageComponent> getComponentElements() {
		return componentElements;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}
	public void signin(String name,String password)
	{
		getUsername().sendKeys(name);
		getPassword().sendKeys(password);
		getSignin().click();
	}
	public void flightBookingPage( ) {
		FlightFinderBean bean=new FlightFinderBean();
		waitForPageToLoad();
		bean.fillFromConfig("data.FlightFinder.user");
		bean.fillUiElements();
		Reporter.log(" flight finder page successfully enter the all the fields");
		getContinueBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("select a Flight"), "Click on Continue button system should not  navigate to select a Flight page",
                "Click on Continue button system should navigate to select a Flight page successfully");
		
	}
	public void flightSelectPage( )  {
		List<SelectPageComponent> list = getComponentElements();
        for (SelectPageComponent selectPageComponent : list) {
            List<QAFWebElement> names = selectPageComponent.getFlightName();
            List<QAFWebElement> radios = selectPageComponent.getRadioButton();
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i).getText();
                if (name.equals("Unified Airlines 563") || name.equals("Blue Skies Airlines 651")) {
                    radios.get(i).click();
            	}
            }
        }
 
        getReserveFlightsBtn().click();
        Reporter.log(" clicking Reserve button it is navigate to book a  flight page successfully ");
	}
	public void bookingFlight()
	{
		BookingFlightBean booking=new BookingFlightBean();
		booking.fillFromConfig("data.bookingFlight.user");
		booking.fillUiElements();
		Reporter.log(" flight booking Page successfully enter all fields");
		getSecureparchaseBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("flight confirmation"), "Click on Continue button system should not  navigate to flight confirmation page",
                "Click on Continue button system should navigate to flight confirmation page successfully");
		Reporter.log("user is able to book flight with appropriate details with flight type round trip successfully");
	}
	public void flights(String fromMonth,String fromDay,String returningMonth,String returningDay,String arriving,String departing)
	{
		getFromMonth().sendKeys(fromMonth);
		getFromDay().sendKeys(fromDay);
		getReturningMonth().sendKeys(returningMonth);
		getReturningDay().sendKeys(returningDay);
		getDeparting().sendKeys(departing);
		getArriving().sendKeys(arriving);
		Reporter.log("different departure and arrival dates ");
		getContinueBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("select a Flight"), "Click on Continue button system should not  navigate to select a Flight page",
                "Click on Continue button system should navigate to select a Flight page successfully");
		Reporter.log("different departure and arrival dates it is navigating successfully.");
	}
	public void sameLocations()
	{
		FlightFinderBean bean=new FlightFinderBean();
		bean.fillFromConfig("data.SelectedSameLocations.user");
		bean.fillUiElements();
		getContinueBtn().click();
		Reporter.log("user is able to enter data on flightfinder page successfully");
		getReserveFlightsBtn().click();
		Reporter.log("it is navigating to next page successfully");
		getSecureparchaseBtn().click();
		String actualTitle=driver.getTitle();
		Validator.verifyTrue(actualTitle.contains("flight confirmation"), "Click on Continue button system should not  navigate to flight confirmation page",
                "Click on Continue button system should navigate to flight confirmation page successfully");
		Reporter.log("user successfully book a flight");
	}


}
