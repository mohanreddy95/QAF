package com.pom.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;

public class BookingFlightBean extends BaseFormDataBean{
	@UiElement(fieldLoc="bookingflight.firstname.text",fieldType=Type.selectbox,order=1)
	private String firstName;
	@UiElement(fieldLoc="bookingflight.lastname.text",fieldType=Type.selectbox,order=2)
	private String lastName;
	@UiElement(fieldLoc="bookingflight.creditnumber.text",fieldType=Type.selectbox,order=3)
	private String creditNumber;
	
	
	

}
