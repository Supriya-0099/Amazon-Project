package com.simplilearn.seliniumtest.amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollCheck {
	
	public static void main(String[] args) throws InterruptedException {
		String siteUrl = "https://www.amazon.in";
		String driverPath = "drivers/chromedriver.exe";
		//step2 set system property for selenium driver
		System.setProperty("webdriver.chrome.driver",driverPath);
		//step3  instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		//step 4 launch browser
		driver.get(siteUrl);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

     }

}
