package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Sanjai");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345567");
		
		WebElement log = driver.findElement(By.xpath("//div[contains (text(),'Log In')]"));
		log.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
