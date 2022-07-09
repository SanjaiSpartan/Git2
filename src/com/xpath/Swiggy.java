package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signin.click();
		
		WebElement userph = driver.findElement(By.xpath("//input[@name='mobile']"));
		userph.sendKeys("8056116639");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='name']"));
		username.sendKeys("Sanjai");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Snjjvn@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("8610687077");
		
		driver.quit();
		
	}

}
