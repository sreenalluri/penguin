package com.testing.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testing.pages.turboTaxHomePage;
import com.testing.pages.turboTaxLoginPage;

public class turboTaxLoginPageTests extends CommonTest {
	
	@Test(groups = { "sanity" })

	public void loginTest () {
		
		turboTaxHomePage homepage = PageFactory.initElements(driver , turboTaxHomePage.class);
		turboTaxLoginPage lp = homepage.clickSignIn();
		lp.doLogin("tester.selenium@yahoo.com", "test123");		
	}

}
