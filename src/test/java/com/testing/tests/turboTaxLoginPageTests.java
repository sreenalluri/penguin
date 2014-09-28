package com.testing.tests;

import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testing.pages.turboTaxHomePage;
import com.testing.pages.turboTaxLandingPage;
import com.testing.pages.turboTaxLoginPage;

public class turboTaxLoginPageTests extends CommonTest {
	
	@Test(groups = { "sanity" })

	public void loginTest () throws InterruptedException {
		
		turboTaxHomePage homepage = PageFactory.initElements(driver , turboTaxHomePage.class);
		turboTaxLoginPage lp = homepage.clickSignIn();
		turboTaxLandingPage landing = lp.doLogin("tester.selenium@yahoo.com", "test123");	
		Thread.sleep(5000);
		
		//Asserts
		Assert.assertEquals("Sign Out", landing.SignOut.getText());
	}

}
