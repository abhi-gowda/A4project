package com.EcommerceFallcon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroomingAssin2 {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Thread.sleep(2000);
	Alert a1=driver.switchTo().alert();
    a1 .accept();
    WebElement element4=driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
    System.out.println("---->"+element4.isDisplayed());
    System.out.println(element4.getText());
    
	}

}
