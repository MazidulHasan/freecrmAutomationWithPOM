package com.crm.qa.pages.homePageSections.calender;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CalenderPage extends TestBase{
	
	@FindBy(xpath = "//div[contains(text(),'Calendar')]")
	WebElement calenderSectionHeader;
	

	@FindBy(xpath = "//span[contains(text(),'June 2022')]")
	WebElement calenderCurrentHeader;
	
	public CalenderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyJune2022Month() {
		calenderCurrentHeader.isDisplayed();
		new Actions(driver).moveToElement(calenderCurrentHeader).perform();
		return calenderCurrentHeader.isDisplayed();
	}
	
	public boolean verifyCallendreHeader() {
		calenderCurrentHeader.isDisplayed();
		new Actions(driver).moveToElement(calenderCurrentHeader).perform();
		return calenderSectionHeader.isDisplayed();
	}
}
