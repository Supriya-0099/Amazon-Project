package com.simplilearn.seliniumtest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWhistlist {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		// step1: formulate a test domain url & driver path
				String siteUrl = "https://www.amazon.in";
				String driverPath = "drivers/chromedriver-win64/chromedriver.exe";
						
				// step2: set system properties for selenium driver
				System.setProperty("webdriver.chrome.driver", driverPath);
								
				// step3: instantiate selenium webdriver
				driver = new ChromeDriver();
								
				// step4: launch browser
				driver.get(siteUrl);
				
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		WebElement wishlist = driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span"));
		wishlist.click();
		
	}
	


}
