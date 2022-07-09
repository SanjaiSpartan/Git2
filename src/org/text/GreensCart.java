package org.text;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/");
		
	}

}
