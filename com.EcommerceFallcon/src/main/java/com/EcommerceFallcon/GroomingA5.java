package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroomingA5 {

	public static void main(String[] args) throws Exception {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
	 Thread.sleep(2000);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='With Element']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='text' and  @placeholder='Enter time in seconds']")).sendKeys("2");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Start']")).click();
    Thread.sleep(2000);
    WebElement element=driver.findElement(By.xpath("//select[contains(@class,'border-0 px-3 py-3')]"));
    Select s=new Select(element);
    System.out.println("Its Done");
    s.selectByIndex(1);

	}

}
