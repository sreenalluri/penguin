package com.testing.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonTest {
	
	protected static WebDriver driver = new FirefoxDriver();
	
	@BeforeSuite(alwaysRun = true)
	public void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://turbotax.intuit.com/");
	}
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
}
