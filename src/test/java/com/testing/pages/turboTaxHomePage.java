package com.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.config.PageLocators;
import com.testing.tests.CommonTest;

public class turboTaxHomePage extends CommonTest {
	
	@FindBy(css=PageLocators.signIn_button)
	public WebElement signIn_button;
	
	@FindBy(css=PageLocators.startForFree_button)
	public WebElement startForFree_button;
	
	//Business Logic 
	
	public turboTaxLoginPage clickSignIn () {
		signIn_button.click();
		return PageFactory.initElements(driver, turboTaxLoginPage.class);
	}
	
	public turboTaxStartForFreePage clickStartForFree () {
		startForFree_button.click();
		return PageFactory.initElements(driver, turboTaxStartForFreePage.class);
	}
	

}
