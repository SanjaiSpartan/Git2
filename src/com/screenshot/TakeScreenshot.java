package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//form[contains(@method,'post')]"));
		
		//s
		File s = element.getScreenshotAs(OutputType.FILE);
		
		//d
		File d= new File("C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Sanjai\\sanj.png");
		
		//Copy File
		FileUtils.copyFile(s, d);
		
		driver.quit();		
	}

}
