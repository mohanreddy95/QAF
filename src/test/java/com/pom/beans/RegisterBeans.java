package com.pom.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;
import com.qmetry.qaf.automation.util.RandomStringGenerator.RandomizerTypes;
import com.qmetry.qaf.automation.util.Randomizer;

public class RegisterBeans extends BaseFormDataBean {
	
	@Randomizer(length=15,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.firstname.text")
    private String firstname;
	@Randomizer(length=15,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.lastname.text")
    private String lastname;
	@Randomizer(length=10,type=RandomizerTypes.DIGITS_ONLY)
	@UiElement(fieldLoc="register.phone.text")
	private String phone;
	@Randomizer(length=10,type=RandomizerTypes.MIXED,suffix="@mailinator.com")
	@UiElement(fieldLoc="register.email.text")
	private String email;
	@Randomizer(length=30,type=RandomizerTypes.MIXED)
	@UiElement(fieldLoc="register.address1.text")
	private String address;
	@Randomizer(length=5,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.city.text")
	private String city;
	@Randomizer(type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.state.text")
	private String state;
	@Randomizer(type=RandomizerTypes.DIGITS_ONLY,length=6)
	@UiElement(fieldLoc="register.postalcode.text")
	private String postalcode;
	@UiElement(fieldLoc="register.country.text",fieldType=Type.selectbox)
	private String country;
	@Randomizer(length=6,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.username.text")
	private String username;
	@Randomizer(type=RandomizerTypes.MIXED,length=6)
	@UiElement(fieldLoc="password")
	private String password;
	@Randomizer(length=7,type=RandomizerTypes.MIXED)
	@UiElement(fieldLoc="confirmPassword")
	private String confirmpassword;

}
