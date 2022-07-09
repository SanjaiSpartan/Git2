package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");

		WebElement number = driver.findElement(By.xpath("//input[@type='tel']"));

		number.sendKeys("8056116639");

		WebElement cont = driver.findElement(By.xpath(" //div[@class='submitBottomOption']"));

		cont.click();

		driver.quit();

	}

}
