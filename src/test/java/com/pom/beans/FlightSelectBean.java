package com.pom.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;

public class FlightSelectBean extends BaseFormDataBean {
	@UiElement(fieldLoc="outFlight",fieldType=Type.optionbox,order=1)
	private String outFlight;
	public String getoutFlight() {
		return outFlight;
	}
	public String getinFlight() {
		return inFlight;
	}
	@UiElement(fieldLoc="inFlight",fieldType=Type.optionbox,order=2)
	private String inFlight;

}
