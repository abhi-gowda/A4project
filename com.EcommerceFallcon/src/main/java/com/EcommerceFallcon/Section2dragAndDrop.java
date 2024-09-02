package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section2dragAndDrop {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("i phone 15");
		search.submit();
		Thread.sleep(2000);
		WebElement leftPointer=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		act.dragAndDropBy(leftPointer, 30, 0).perform();
		Thread.sleep(2000);
		WebElement righttPointer=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		act.dragAndDropBy(righttPointer, -30, 0).perform();
		}

}
