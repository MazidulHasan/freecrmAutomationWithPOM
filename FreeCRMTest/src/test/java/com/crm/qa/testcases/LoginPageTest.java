package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	LandingPage landingPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		landingPage = new LandingPage();
		
		loginPage = landingPage.loginLink();//click login link to go to login page
		
		//validate login page
		String loginPageTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Cogmento CRM");
	}
	
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title  = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority = 2)
	public void loginPageLoginTest() {
		homePage  = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); //set login user name and password
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
