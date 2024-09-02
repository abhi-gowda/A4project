package com.EcommerceFallcon;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(3000);
		List<WebElement> allLinks=driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
		Iterator<WebElement>itr=allLinks.iterator();
		while(itr.hasNext())
		{
			Thread.sleep(3000);
			String values=itr.next().getText();
			System.out.println(values); 
		}

		
		
		
		
		

	}

}
