package com.crm.qa.pages.homePageSections.contacts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CreateNewContactsPage extends TestBase{
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save;
	
	public CreateNewContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void firstName(String userFirstName) {
		firstName.click();
		firstName.sendKeys(userFirstName);
	}

	public void lastName(String userLastName) {
		lastName.click();
		lastName.sendKeys(userLastName);
	}
	
	public ContactDetailsPage saveForm() {
		save.click();
		return new ContactDetailsPage();
	}
}
