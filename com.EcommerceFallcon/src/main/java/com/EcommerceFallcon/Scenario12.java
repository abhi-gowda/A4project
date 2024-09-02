package com.EcommerceFallcon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Pick Time']")).click();
		WebElement pointer1=driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']/following-sibling::div[@class='MuiClock-pin css-12ha4i7']"));
	    Actions act=new Actions(driver);
	    WebElement thrs=driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']/following-sibling::div[@aria-label='Select hours. Selected time is 12:00 AM']/span[text()='10']"));
	    act.moveToElement(pointer1).clickAndHold(pointer1).moveToElement(thrs).release().perform();
	    WebElement pointer2=driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']/following-sibling::div[@class='MuiClock-pin css-12ha4i7']"));
	    WebElement mints=driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']/following-sibling::div[@class='MuiClockPointer-root css-a1rc6s']/following-sibling::div[@class='MuiClock-wrapper css-1nob2mz']/span[@aria-label='30 minutes']"));
	    act.moveToElement(pointer2).clickAndHold(pointer2).moveToElement(mints).release().perform();
	    Thread.sleep(3000);
	    driver.quit();

	}

}  
