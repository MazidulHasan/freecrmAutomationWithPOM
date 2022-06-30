package com.crm.qa.pages.homePageSections.contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement createNewContact;
	
	@FindBy(xpath = "//span[contains(text(),'Md Rumman')]")
	WebElement userName;	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CreateNewContactsPage createNewContactLinkClick() {
		new Actions(driver).moveToElement(createNewContact).click().perform();
		return new CreateNewContactsPage();
	}
	
	public boolean chekUserName() {
		userName.click();
		return userName.isDisplayed();
	}
}
