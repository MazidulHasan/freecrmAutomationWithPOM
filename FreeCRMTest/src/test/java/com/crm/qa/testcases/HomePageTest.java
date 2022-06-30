package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.homePageSections.calender.CalenderPage;

public class HomePageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	CalenderPage calenderPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		landingPage = new LandingPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		calenderPage = new CalenderPage();
		
		loginPage = landingPage.loginLink();
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void homePageTitleTest() {
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void loginUserNameTest() {
		Assert.assertTrue(homePage.verifyCurrentUserName());
	}
	
	@Test(priority = 3)
	public void calenderLinkTest() {
		calenderPage = homePage.calenderLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
