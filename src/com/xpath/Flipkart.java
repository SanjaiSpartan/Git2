package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click();

		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("Sanjai");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("8056116639");

		driver.quit();

	}

}
