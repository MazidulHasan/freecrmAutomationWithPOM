package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(name ="email")
	WebElement emailAddress;
	
	@FindBy(name = "phone")
	WebElement phoneNumber;
	
	@FindBy(id = "terms")
	WebElement aggreeTermsAndConditions;
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	WebElement recaptcha;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signUpButton;
	
	@FindBy(xpath = "//image[contains(@src,'/static/images/logo-small.png')]")
	WebElement registerLogo;
}
