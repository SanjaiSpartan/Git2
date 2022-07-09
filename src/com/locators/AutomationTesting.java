package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		WebElement firstpass = driver.findElement(By.id("firstpassword"));
		firstpass.sendKeys("8610687077");
		
		
		WebElement secondpass = driver.findElement(By.id("secondpassword"));
		
		secondpass.sendKeys("8610687077");
		
		driver.quit();
		
		
		
}

}
