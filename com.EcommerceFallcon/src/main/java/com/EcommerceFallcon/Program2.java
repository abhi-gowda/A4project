package com.EcommerceFallcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws Exception {
		String excpectedData="/auth/login";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String actualData=driver.getCurrentUrl();
		if(actualData.contains(excpectedData)) {
			System.out.println("login page is verifyed");
		}
		else
		{
			System.out.println("Not v");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		WebElement element=	driver.findElement(By.xpath("//input[@name='password']"));
		element.sendKeys("admin123");
		element.submit();
		driver.quit();
				
			         	//Another Method To verify or Display
	
		//WebElement element=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));
		//Thread.sleep(3000);
		//System.out.println("login page is verified"+element.isDisplayed());
		

	}

}
