package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Actions act=new Actions(driver);
        WebElement element1=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		act.dragAndDrop(element1, element2).perform();
		
		WebElement element3=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		Thread.sleep(2000);
		WebElement element4=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		act.dragAndDrop(element3, element4).perform();
		
		WebElement element5=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		Thread.sleep(2000);
		WebElement element6=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Thread.sleep(2000);
		act.dragAndDrop(element5, element6).perform();
		
		
		WebElement element7=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(2000);
		WebElement element8=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Thread.sleep(2000);
		act.dragAndDrop(element7, element8).perform();

	}

}
