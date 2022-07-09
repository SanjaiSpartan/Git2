package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone");
		
		WebElement ele= driver.findElement(By.xpath("//input[@type='submit']"));
		
		ele.click();
		
		driver.quit();
		
	}

}
