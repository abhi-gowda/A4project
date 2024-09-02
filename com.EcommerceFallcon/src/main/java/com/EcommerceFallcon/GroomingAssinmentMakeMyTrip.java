package com.EcommerceFallcon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroomingAssinmentMakeMyTrip {
public static void main(String[] args) throws Exception {
		
		String fromCity = "BLR";
		String toCity = "DXB";
		String expectedDate = "Dec 21 2024";
		String expectedMonth = "December";
		String expectedTravellers = "5";

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(fromCity);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(toCity);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(3000);
		
		WebElement monthValue = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]"));
		WebElement nextMonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		
		while (!monthValue.getText().contains(expectedMonth)) {
			nextMonth.click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+expectedDate+"')]")).click();
		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		Thread.sleep(2000);
		List<WebElement> noOfTravellers = driver.findElements(By.xpath("//div[@class='appendBottom20']/ul[@class='guestCounter font12 darkText gbCounter']/li"));
				for (WebElement traveller:noOfTravellers) {
					if(traveller.getText().equals(expectedTravellers))
						{
						traveller.click(); 
						}
				}
				
		driver.findElement(By.xpath("//button[text()='APPLY']")).click(); 
		driver.findElement(By.xpath("//a[text()='Search']")).click();
						
		
		Thread.sleep(3000);
		driver.quit();

	
		
	}

}
