package com.crm.qa.testcases.homePageSectonTest.contacts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.homePageSections.contacts.ContactDetailsPage;
import com.crm.qa.pages.homePageSections.contacts.ContactsPage;
import com.crm.qa.pages.homePageSections.contacts.CreateNewContactsPage;
import com.crm.qa.util.TestUtil;

public class ContactDetailsPageTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	CreateNewContactsPage createNewContactsPage;
	ContactDetailsPage contactDetailsPage;
	
	public ContactDetailsPageTest() {
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
		Assert.assertTrue(contactsPage.chekUserName());
		createNewContactsPage = contactsPage.createNewContactLinkClick();
	}
	
//	@Test(priority = 1)
//	public void verifyCalenderPageHeader() {
//	}
	

	
	
	@Test(priority = 2, dataProvider = "getCRMTestData")
	public void createNewContactTest(String userFname, String userLname) {
		createNewContactsPage.firstName("userFname");
		createNewContactsPage.lastName("userLname");
		contactDetailsPage = createNewContactsPage.saveForm();
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
