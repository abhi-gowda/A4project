package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section2Scenario6 {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		Actions act=new Actions(driver);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       Thread.sleep(2000);
       WebElement element=driver.findElement(By.xpath("//span[text()='Electronics']"));
       act.click(element).perform();
       Thread.sleep(2000);
       WebElement element1=driver.findElement(By.xpath("//span[text()='Men']"));
       act.moveToElement(element1).perform();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.quit();

	}

}
