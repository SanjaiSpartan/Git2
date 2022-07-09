package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btn.click();
		
		WebElement btn1 = driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]"));
		btn1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Sanjai");
		alert.accept();
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Sanjai')]"));
		String text = txt.getText();
		System.out.println(text);
	
		
		
	}

}
