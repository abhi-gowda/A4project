package com.EcommerceFallcon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section2DropDown {

	public static void main(String[] args) throws Exception {
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
   driver.manage().window().maximize();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
   driver.findElement(By.xpath("//span[text()='Leave']")).click();
   driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
//   Robot r=new Robot();
//   for(int i=1;i<=4;i++)
//   {
//	   r.keyPress(KeyEvent.VK_DOWN);
//	   r.keyRelease(KeyEvent.VK_DOWN);
//	   r.keyPress(KeyEvent.VK_ENTER);
//	   r.keyRelease(KeyEvent.VK_ENTER);
//   }
   driver.findElement(By.xpath("//span[text()='CAN - Personal']")).click();

	}

}
