package com.crm.qa.pages.homePageSections.contacts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetailsPage extends TestBase{
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath = "//*[@id=\'dashboard-toolbar\']/div[1]")
	WebElement contactNameHolder;
	
	public ContactDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void waitUntilPageIsLoaded() {
		// explicit wait of invisibility condition
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOf(save));
	}
	
	public String getContactName() {
		contactNameHolder.click();
		return contactNameHolder.getText();
	}
	
	public boolean userName(String fullName) {
		System.out.println("Real user name is :"+getContactName()+" and the sended user name is"+fullName);
		if(getContactName().equals(fullName)) {		
			return true;
		}
		return false;
	}
}
