package com.EcommerceFallcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section2KeyclassProgram {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	    
	    

	}

}
