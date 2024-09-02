package com.EcommerceFallcon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario11 {

	public static void main(String[] args) throws  Exception {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.get("https://www.flipkart.com/");
	 WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("Rx parts");
		ele.submit();
		Robot r=new Robot();
		for(int i=1;i<=10;i++)
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
		}
		driver.close();

	}

}
