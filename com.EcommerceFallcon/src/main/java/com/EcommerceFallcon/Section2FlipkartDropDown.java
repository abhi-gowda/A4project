package com.EcommerceFallcon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section2FlipkartDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("(//span[@class='TSD49J'])[3]"));
		act.moveToElement(ele).perform();
		List<WebElement> allLinks=driver.findElements(By.xpath("//a[@class='jBYtJt']"));
		Iterator<WebElement>itr=allLinks.iterator();
		while(itr.hasNext())
		{
			String values=itr.next().getText();
			System.out.println(values); 
		}

	}

}
