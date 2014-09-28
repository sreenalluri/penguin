package com.testing.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testing.pages.turboTaxHomePage;
import com.testing.pages.turboTaxStartForFreePage;

public class turboTaxStartForFreePageTests extends CommonTest{
	
	@Test(groups = { "sanity" })

	public void startForFree () {

		turboTaxHomePage homepage = PageFactory.initElements(driver , turboTaxHomePage.class);
		turboTaxStartForFreePage page = homepage.clickStartForFree();
		((JavascriptExecutor) driver).executeScript("scrollTo(0,640);");

		page.clickStartForFree_FreeEdition();
				
	}


}
