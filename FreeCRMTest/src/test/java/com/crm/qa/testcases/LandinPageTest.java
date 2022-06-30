package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LandinPageTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage;
	
	public LandinPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		landingPage = new LandingPage();
	}
	
	@Test(priority = 1)
	public void landingPageTitle() {
		String landingPageTitle = landingPage.validateTitle();
		Assert.assertEquals(landingPageTitle, "Free CRM software for customer relationship management, sales, marketing campaigns and support.");
	}
	
	@Test(priority = 2)
	public void loginPage() {
		loginPage = landingPage.loginLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
