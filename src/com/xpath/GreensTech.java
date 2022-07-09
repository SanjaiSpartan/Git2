package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement modelresume = driver.findElement(By.xpath("//div[@id='heading201']"));
		modelresume.click();

		WebElement resume1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		resume1.click();

		driver.quit();
	}

}
