package com.crm.qa.pages;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory (Object repository)
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\'ui\']/div/div/form/div/div[3]")
	WebElement loginButton;

	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String userEmail,String userPassword) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The userEmail is :"+userEmail+" And the user pass is : "+userPassword);
		email.click();
		email.sendKeys(userEmail);
		password.click();
		password.sendKeys(userPassword);
		loginButton.click();
		return new HomePage();
	}
}
