package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("  https://infinity.icicibank.com/corp/Login.jsp ");
		
		WebElement txtuserid = driver.findElement(By.name("DUMMY1"));
		txtuserid.sendKeys("9532527425253");
		
		driver.quit();
		
}

}
