package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section2ZoomButton {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[@class='zoom-button ']"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
		Thread.sleep(3000);
		act.release().perform();
		driver.quit();
	}

}
