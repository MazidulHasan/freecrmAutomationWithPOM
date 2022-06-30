package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.homePageSections.calender.CalenderPage;
import com.crm.qa.pages.homePageSections.contacts.ContactsPage;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[contains(text(),'Md Rumman')]")
	WebElement userName;
	
	@FindBy(xpath = "//b[contains(text(),'New company')]")
	WebElement companyName;
	
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	WebElement homeLink;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCurrentUserName() {
		return userName.isDisplayed();
	}
	
	public void homeLink() {
		homeLink.click();
	}
	
	public CalenderPage calenderLink() {
		calendarLink.click();
		return new CalenderPage();
	}
	
	public ContactsPage contactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
}
