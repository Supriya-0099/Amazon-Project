package com.simplilearn.seliniumtest.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 * This class demonstrate test script for search on google search engine.
 * Selenium web driver
 */
public class GoogleSearchTest {
	
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
		//locate search box
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit ();
	
		
		String expectedTitle = "selenium documentation - Google Search";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+ expectedTitle);
		System.out.println("Actual Title: "+ actualTitle);
		//step6: close browser
		driver.close();
		
		
	}

}
