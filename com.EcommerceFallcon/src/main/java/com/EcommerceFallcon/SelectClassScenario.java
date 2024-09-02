package com.EcommerceFallcon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassScenario {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@id='phoneInput']"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		s.selectByValue("+02");
		s.selectByVisibleText("+92");
		System.out.println("all optinons in phoneNo");
		String text=ele.getText();
		System.out.println(text);
		
		WebElement ele1=driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		Select s1=new Select(ele1);
		s1.selectByIndex(1);
		s1.selectByValue("United Kingdom");
		s1.selectByVisibleText("Poland");
		System.out.println("-----------------------------");
		System.out.println(s1.isMultiple());
		System.out.println("-----------------------------");
		System.out.println("all options are :");
		
		List<WebElement> allOptions=s1.getOptions();
		for(WebElement elements :allOptions)
		{
			String value=elements.getText();
			System.out.println(value);
		}
		Thread.sleep(2000);
		System.out.println("-----------------------------");
		System.out.println("All selected Options are : ");
		List<WebElement> allselected=s1.getAllSelectedOptions();
		for(WebElement elements:allselected)
		{
			String values=elements.getText();
			System.out.println(values);
		}
		
		//driver.quit();
		

	}

}
