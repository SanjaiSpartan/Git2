package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://greenstech.in/selenium-course-content.html");
		
		WebElement btnLogin=driver.findElement(By.xpath("(//a[contains(@role,'tab')])[3]"));
		btnLogin.click();
		
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'expert in Selenium')]"));
		String text = txt.getText();
		System.out.println(text);
		
		driver.quit();
		
		
	}

}
