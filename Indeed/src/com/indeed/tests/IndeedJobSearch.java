package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Create Chrome Driver to drive browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ahmed_000\\Desktop\\Selenium\\ChromeDriverTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Indeed Home page
		driver.get("http://www.indeed.com");
		Thread.sleep(1000);
		
		//Find "what" field; enter Selenium
		driver.findElement(By.id("what")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		//Find "location" field; enter NYC
		driver.findElement(By.id("where")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("where")).sendKeys("NYC");
		Thread.sleep(1000);
		
		//Find jobs button; click on it
		driver.findElement(By.id("fj")).click();
		
		//From results, get page Title + 
			// Jobs count
		String x = driver.getTitle();
		String y = driver.findElement(By.id("searchCount")).getText();

		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
