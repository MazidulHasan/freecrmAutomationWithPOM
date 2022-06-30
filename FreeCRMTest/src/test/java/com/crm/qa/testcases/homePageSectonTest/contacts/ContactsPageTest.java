package com.crm.qa.testcases.homePageSectonTest.contacts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.homePageSections.contacts.ContactsPage;
import com.crm.qa.pages.homePageSections.contacts.CreateNewContactsPage;

public class ContactsPageTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	CreateNewContactsPage createNewContactsPage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		
		loginPage = landingPage.loginLink();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.contactsLink();
	}
	
//	@Test(priority = 1)
//	public void verifyCalenderPageHeader() {
//	}
	
	@Test(priority = 2)
	public void clickCreateNewContactLinkTest() {
		createNewContactsPage = contactsPage.createNewContactLinkClick();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
