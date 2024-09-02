package com.EcommerceFallcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) throws Exception {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
    Thread.sleep(3000);
    element.sendKeys("i phone11");
    element.submit();
    driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (White, 128 GB)']")).click();
    Thread.sleep(2000);
    driver.quit();
	}
}
