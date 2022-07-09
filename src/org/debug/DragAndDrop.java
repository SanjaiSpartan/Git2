package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.id("credit2"));
		WebElement d=driver.findElement(By.id("bank"));
		
		WebElement e=driver.findElement(By.id("fourth"));
		WebElement f=driver.findElement(By.id("amt7"));
		
		WebElement g=driver.findElement(By.id("credit1"));
		WebElement h=driver.findElement(By.id("loan"));
		
		WebElement i=driver.findElement(By.id("fourth"));
		WebElement j=driver.findElement(By.id("amt8"));
		
		Actions actions= new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		actions.dragAndDrop(e, f).perform();
		actions.dragAndDrop(g, h).perform();
		actions.dragAndDrop(i, j).perform();
		
		WebElement dr=driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = dr.getText();
		System.out.println(text);
		driver.quit();
		

	}
}
