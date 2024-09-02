package com.EcommerceFallcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@id='attended']"));
		System.out.println("Element is displayed):"+ element.isDisplayed());
		System.out.println("Element is Enabled):"+ element.isEnabled());
		System.out.println("Element is selected):"+ element.isSelected());
		System.out.println("Element size is):"+ element.getSize());
		System.out.println("Element location is):"+ element.getLocation());
		System.out.println( element.getAttribute("id"));
	    System.out.println( element.getTagName());
	    driver.close();
	}

}
