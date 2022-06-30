package com.crm.qa.testcases.homePageSectonTest.calender;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.homePageSections.calender.CalenderPage;

public class CalenderPageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	CalenderPage calenderPage;
	
	public CalenderPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		calenderPage = new CalenderPage();
		
		loginPage = landingPage.loginLink();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		calenderPage = homePage.calenderLink();
	}
	
	@Test(priority = 1)
	public void verifyCalenderPageHeader() {
//		Assert.assertTrue(calenderPage.verifyCallendreHeader());
	}
	
	@Test(priority = 2)
	public void verifyCalernderCurrentMonth() {
		Assert.assertTrue(calenderPage.verifyJune2022Month());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
