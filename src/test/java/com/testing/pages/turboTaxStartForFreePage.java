package com.testing.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.config.PageLocators;
import com.testing.tests.CommonTest;

public class turboTaxStartForFreePage extends CommonTest {
	
	/*WebDriver driver;
	public turboTaxStartForFreePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}*/
	
	@FindBy(linkText=PageLocators.showRecommendationsButton)
	public WebElement showRecommendationsButton;
	
	@FindBy(xpath=PageLocators.startFreeEdition)
	public WebElement startFreeEdition;
	
	@FindBy(css=PageLocators.skip)
	public WebElement skip;
	
	public turboTaxCreateAccountPage clickStartForFree_FreeEdition () {
		startFreeEdition.click();

		skip.click();
		return PageFactory.initElements(driver, turboTaxCreateAccountPage.class);
	}

}
