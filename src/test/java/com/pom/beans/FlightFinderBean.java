package com.pom.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;

public class FlightFinderBean extends BaseFormDataBean{
	@UiElement(fieldLoc="tripType",fieldType=Type.optionbox,order=1)
	private String tripType;	
	
	@UiElement(fieldLoc="flight.passengers.text",fieldType=Type.selectbox,dependsOnField="tripType",order=2)
	private String passengers;
	@UiElement(fieldLoc="flight.departing.text",fieldType=Type.selectbox,order=3)
	private String departing;
	@UiElement(fieldLoc="flight.frommonth.text",fieldType=Type.selectbox,order=4)
	private String fromMonth;
	@UiElement(fieldLoc="flight.formday.text",fieldType=Type.selectbox,order=5)
	private String fromDay;
	@UiElement(fieldLoc="flight.arriving.text",fieldType=Type.selectbox,order=6)
	private String arriving;
	@UiElement(fieldLoc="flight.returningmonth.text",fieldType=Type.selectbox,order=7)
	private String returningMonth;
	@UiElement(fieldLoc="flight.returningday.text",fieldType=Type.selectbox,order=8)
	private String returningDay;
	public String getRoundTrip() {
		return tripType;
	}
	public String getPassengers() {
		return passengers;
	}
	public String getDeparting() {
		return departing;
	}
	public String getFrommonth() {
		return fromMonth;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public String getFromMonth() {
		return fromMonth;
	}
	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}
	public String getFromDay() {
		return fromDay;
	}
	public void setFromDay(String fromDay) {
		this.fromDay = fromDay;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public void setDeparting(String departing) {
		this.departing = departing;
	}
	public void setArriving(String arriving) {
		this.arriving = arriving;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public void setReturningDay(String returningDay) {
		this.returningDay = returningDay;
	}

	public String getDay() {
		return fromDay;
	}
	public String getArriving() {
		return arriving;
	}
	public String getReturningMonth() {
		return returningMonth;
	}
	public String getReturningDay() {
		return returningDay;
	}
	

}
