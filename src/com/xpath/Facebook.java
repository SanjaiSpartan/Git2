package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU0NTE3ODIyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");

		WebElement txtusername = driver.findElement(By.xpath("//input[@type='text']"));

		txtusername.sendKeys("snjjvn@gmail.com");

		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));

		txtpassword.sendKeys("8610687077");

		WebElement click = driver.findElement(By.xpath("//button[@value='1']"));
		click.click();

		driver.quit();

	}

}
