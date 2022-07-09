package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement search = driver.findElement(By.xpath("//input[@dir='auto']"));
		search.sendKeys("Advance MuscleMass Beginner's Whey Protein Supplement");

		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));

		click.click();

		driver.quit();
	}

}
