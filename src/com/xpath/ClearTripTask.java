package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripTask {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom =driver.findElement(By.xpath("//input[@title='From station']"));
		txtFrom.sendKeys("Chennai");
		
		WebElement txtTo =driver.findElement(By.xpath("//input[@title='To station']"));
		txtTo.sendKeys("Madurai");
		
		WebElement btnLogin =driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		
		driver.quit();
		
	}

}
