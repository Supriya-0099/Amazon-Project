package com.simplilearn.seliniumtest.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 * This class demonstrate test script for search on google search engine.
 * Selenium web driver
 */

public class GoogleHomepageTest {
 
	public static void main(String[] args) {
		
		// step1: formulate a test domain url and driver path
		String siteUrl = "https://www.google.com/";
		String drivePath = "drivers/chromedriver-win64/chromedriver.exe";
		
		// step2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", drivePath);
		
		// step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		// step4: launch browser
		driver.get(siteUrl);
		
		// step5 : Evaluate the Test
		
		if(siteUrl.equals(driver.getCurrentUrl())) {
		     System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		System.out.println("Expected Url :: " + siteUrl);
		System.out.println("Actual Url :: " + driver.getCurrentUrl());
		//step6: close browser
		driver.close();
		
		
	}

}


