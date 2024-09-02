package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsScenario {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	   	driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
	   	Alert a1=driver.switchTo().alert();
	   	
	    String text=a1.getText();
	    System.out.println(text);
	    
	    a1.sendKeys("yes");
	    a1.accept();
	    
	    WebElement element= driver.findElement(By.xpath("//p[text()='You selected yes']"));
	    System.out.println(element.getText());	  	
	}

}
