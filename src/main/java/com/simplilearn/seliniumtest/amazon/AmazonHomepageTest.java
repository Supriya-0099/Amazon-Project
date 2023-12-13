package com.simplilearn.seliniumtest.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 * This class demonstrate test for amazon webpage.
 * Selenium web driver
 */
public class AmazonHomepageTest {

	public static void main(String[] args) {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/chromedriver-win64/chromedriver.exe";
		
		// step2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
				
	    // step3: instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
				
		// step4: launch browser
		driver.get(siteUrl);
		
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+ expectedTitle);
		System.out.println("Actual Title: "+ actualTitle);
		
		// step6: close driver
		driver.close();
				
				
	}
}
