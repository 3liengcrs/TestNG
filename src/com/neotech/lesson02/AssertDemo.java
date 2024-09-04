package com.neotech.lesson02;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class AssertDemo extends CommonMethods {
	
	
	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
	
	@Test (enabled=false)
	public void titleValidation() {
		String expected = "OrangeHRM";
		String actual = driver.getTitle();
		
		//1st way
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(expected, actual, "Title does NOT MATCH!!!!");
		
		System.out.println("This is the end of title validation test.");
		
		
	}
	@Test
	public void logoValidation() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoExists = logo.isDisplayed();
		logoExists = false;
		
		//Assert.assertEquals(logoExists, true);
		Assert.assertTrue(logoExists, "Logo is NOT displayed!");
	}

}
