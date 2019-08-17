package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {

	// Page factory :OR [Object Repository]

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement crmLogo;

	// Initialize the Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
		// PageFactory.initElements(driver, LoginPage.class);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pw) {
		
		username.sendKeys(un);
		password.sendKeys(pw);
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TestUtil.onClick(driver, loginBtn, 20);
		//.click();
		return new HomePage();
	}
}
