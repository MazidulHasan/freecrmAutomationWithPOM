package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CustomerPage extends TestBase{
	@FindBy(xpath = "")
	WebElement create;
	
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewContactLinkClick() {
		
	}
}
