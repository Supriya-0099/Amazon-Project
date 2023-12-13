package com.simplilearn.seliniumtest.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserSignIn {
	
	public static void main(String[] args) {
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/chromedriver-win64/chromedriver.exe";
		//step2 set system property for selenium driver
		System.setProperty("webdriver.chrome.driver",driverPath);
		//step3  instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		//step 4 launch browser
		driver.get(siteUrl);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		boolean present;
		try {
			   driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
		if(present==true) {
			System.out.println("Do Log In");
		}else {
			System.out.println("Already Logged In");
		}
		//WebElement check = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
   }
}


