package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
	WebElement crmLogo;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement loginLink;
	
	@FindBy(xpath = "//a[@href='https://api.freecrm.com/register/']")
	WebElement signUpLink;
	
	@FindBy(xpath = "//a[@href='https://freecrm.com/pricing.html']")
	WebElement pricingLink;
	
	@FindBy(xpath = "//a[@href='https://freecrm.com/features.html']")
	WebElement featuresLink;
	
	@FindBy(xpath = "//a[@href='https://freecrm.com/customers.html']")
	WebElement customerLink;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public LoginPage loginLink() {
		loginLink.click();
		return new LoginPage();
	}
	
	public SignUpPage signUpLink() {
		signUpLink.click();
		return new SignUpPage();
	}
	
	public PricingPage pricingLink() {
		pricingLink.click();
		return new PricingPage();
	}
	
	public FeaturesPage featureLink() {
		featuresLink.click();
		return new FeaturesPage();
	}
	
}
