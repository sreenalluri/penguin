package com.testing.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testing.pages.turboTaxHomePage;

public class turboTaxHomePageTests extends CommonTest {
	
	@Test(groups = { "sanity" })
	public void getHomePage () {
		
		turboTaxHomePage homepage = PageFactory.initElements(driver , turboTaxHomePage.class);
		homepage.clickSignIn();
	}

}
