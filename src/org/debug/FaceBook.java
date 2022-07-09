package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
        user.sendKeys("snjjvn@gmail.com");
        
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("5769876");
        
        WebElement click = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
        click.click();
        Thread.sleep(2000);
        
        WebElement first = driver.findElement(By.xpath("//input[contains(@placeholder,'First name')]"));
        first.sendKeys("snjjvn@gmail.com");
        
        WebElement last = driver.findElement(By.xpath("//input[contains(@aria-label,'Surname')]"));
        last.sendKeys("RS");
        
        driver.quit();

}
}
