package com.simplilearn.seliniumtest.timeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This Class will demonstrate implicit wait test synchronization.
 */
public class ImplicitWaitTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		setUp();
		
		testMobileNavLink();
		
		testBestSellerNavLink();
	}
	
	public static void setUp() {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/chromedriver-win64/chromedriver.exe";
				
		// step2: set system properties for selenium driver
		System.setProperty("webdriver.chrome.driver", driverPath);
						
		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();
		
		//step4: add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
						
		// step5: launch browser
		driver.get(siteUrl);
	}
	
    public static void testMobileNavLink() {
    	
    	WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
    	
    	System.out.println("Is link loaded :: "+mobileLink.isDisplayed());
    	System.out.println("Is link loaded :: "+mobileLink.isEnabled());
 
    	mobileLink.click();
    	
    	String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
        String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+ expectedTitle);
		System.out.println("Actual Title: "+ actualTitle);
					
	}
    
public static void testBestSellerNavLink() {
    	
    	WebElement bestSellerLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
    	
    	System.out.println("Is link loaded :: "+ bestSellerLink.isDisplayed());
    	System.out.println("Is link loaded :: "+ bestSellerLink.isEnabled());
 
    	bestSellerLink.click();
    	
    	String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
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
      
    



