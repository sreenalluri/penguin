package com.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.config.PageLocators;
import com.testing.tests.CommonTest;

public class turboTaxLoginPage extends CommonTest {
	
	@FindBy(id=PageLocators.username)
	public WebElement username;
	
	@FindBy(id=PageLocators.password)
	public WebElement password;
	
	@FindBy(xpath=PageLocators.SignIn)
	public WebElement SignIn;
	
	//Business Logic
	
	public turboTaxLandingPage doLogin (String username, String password) {
		
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		SignIn.click();
		return PageFactory.initElements(driver, turboTaxLandingPage.class);
	}
	

}
