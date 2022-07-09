package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Sanjai");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Snjjvn@123");
		
		driver.quit();
}
}