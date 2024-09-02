package com.EcommerceFallcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		WebElement element=driver.findElement(By.xpath("//div[@class=' rounded-md flex flex-col justify-between h-[100%]']"));
		Thread.sleep(3000);
		System.out.println("Contact page is verifiyed"+element.isDisplayed());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		WebElement element1=driver.findElement(By.xpath("//div[@class=' rounded-md flex flex-col justify-between h-[100%]']"));
		Thread.sleep(3000);
		System.out.println("payment page is verifiyed"+element1.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		WebElement element2=driver.findElement(By.xpath("//div[@class=' rounded-md flex flex-col justify-between h-[100%]']"));
		Thread.sleep(3000);
		System.out.println("return page is verifiyed"+element2.isDisplayed());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Youtube']")).click();
		WebElement element3=driver.findElement(By.xpath("//div[@class=' rounded-md flex flex-col justify-between h-[100%]']"));
		Thread.sleep(3000);
		System.out.println("Youtube page is verifiyed"+element3.isDisplayed());
		driver.close();
	}

}
