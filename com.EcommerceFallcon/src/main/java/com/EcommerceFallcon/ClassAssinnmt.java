package com.EcommerceFallcon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssinnmt {

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
	 driver.findElement(By.xpath("//span[text()='Leave']")).click();
     driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
     List<WebElement> ele=driver.findElements(By.xpath("//div[@role='option']/span   "));
     ArrayList<String>all=new ArrayList<String>();
     for(int i=0;i<ele.size();i++)
     {
    	 all.add(ele.get(i).getText());
    	 System.out.println(ele.get(i).getText());
     }
     System.out.println(all); 
     Collections.sort(all);
   //   System.out.println(all);
     Collections.reverse(all);
     System.out.println(all); 
     driver.quit();
    
     
     
	}
}

