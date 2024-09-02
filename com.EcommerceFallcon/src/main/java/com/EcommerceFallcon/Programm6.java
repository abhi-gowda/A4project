package com.EcommerceFallcon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programm6 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
	    element.sendKeys("iphone 15");
		element.submit();
		List<WebElement> elements=driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<=elements.size()-1;i++)
		{
			if(i==0||i==1||i==22||i==23)
			{
				elements.get(i).click();
				Thread.sleep(2000);
			}
		}
		
		//Another Method
		
	//driver.findElement(By.xpath("//div[@class='KzDlHZ' and text()='Apple iPhone 15 (Black, 128 GB)']")).click();
	//	driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
	//  driver.findElement(By.xpath("(//span[text()='Add to Compare'])[2]")).click();
	//	driver.findElement(By.xpath("(//span[text()='Add to Compare'])[3]")).click();
	//	driver.findElement(By.xpath("(//span[text()='Add to Compare'])[4]")).click();
	//	driver.close();
		
	}

}
