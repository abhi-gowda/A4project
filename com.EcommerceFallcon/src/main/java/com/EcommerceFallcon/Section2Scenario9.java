package com.EcommerceFallcon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section2Scenario9 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
		WebElement ele1=driver.findElement(By.xpath("//input[@name='q']"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		ele1.sendKeys("iphone 14");
		ele1.submit();
		WebElement ele3=driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[24]"));
		act.scrollToElement(ele3).perform();
		

	}

}
