package com.simplilearn.seliniumtest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 * This class demonstrate test for amazon webpage.
 *
 */

public class AmazonSearchTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/chromedriver-win64/chromedriver.exe";
				
		// step2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
						
		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();
						
		// step4: launch browser
		driver.get(siteUrl);
		
		testSearch1();
		testSearch2();
	}
	
	/**
	 * search for a product.
	 */
	
	private static void testSearch1() {
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 15 pro max");
		searchBox.submit();
		
		String expectedTitle = "Amazon.in : Iphone 15 pro max";
        String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+ expectedTitle);
		System.out.println("Actual Title: "+ actualTitle);
	}
	

	/**
	 * search for a product.
	 */
	
	private static void testSearch2() {
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("Apple Mac Book");
		searchBox.submit();
		
		String expectedTitle = "Amazon.in : Apple Mac Book";
        String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+ expectedTitle);
		System.out.println("Actual Title: "+ actualTitle);
    }

}


