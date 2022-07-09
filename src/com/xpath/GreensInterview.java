package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensInterview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement interview = driver.findElement(By.xpath("//div[@id='heading20']"));
		interview.click();

		WebElement ele = driver.findElement(By.xpath("(//a[@target='_blank'])[102]"));
		ele.click();
		
		driver.quit();

	}

}
