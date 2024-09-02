package com.EcommerceFallcon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroomingA7 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		WebElement element=	driver.findElement(By.xpath("//input[@name='password']"));
				element.sendKeys("admin123");
				element.submit();
	    driver.findElement(By.xpath("//span[text()='Time']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("e");
	    List<WebElement> element1=driver.findElements(By.xpath("//div[@role='option']/span"));
	    Iterator<WebElement>itr=element1.iterator();
		while(itr.hasNext())
		{
			String values=itr.next().getText();
			System.out.println(values); 
		}
        WebElement element2=driver.findElement(By.xpath("(//div[@role='option'])[1  ]"));
        element2.click();
       // driver.quit();
	}

}
