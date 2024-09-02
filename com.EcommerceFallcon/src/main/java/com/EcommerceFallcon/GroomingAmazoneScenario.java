package com.EcommerceFallcon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GroomingAmazoneScenario {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select s=new Select(ele);
		s.selectByIndex(10);
		WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
		ele1.sendKeys("Books");
		ele1.submit();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Price: High to Low']")).click();
		WebElement ele3=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		String pname=ele3.getText();
		System.out.println("Name of The Product------->"+pname);
		WebElement ele4=driver.findElement(By.xpath("//span[text()='Britannica Global Edition 2016 ( 30 Volumes )']/../../../following-sibling::div[@class='puisg-row']/div/div/div/div[@class='a-row a-size-base a-color-base']/div[@class='a-row']/a/span/span/span[@class='a-price-whole']"));
		String price=ele4.getText();
		System.out.println("price of The Product------>"+price);
		Actions act=new Actions(driver);
		WebElement ele5=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		act.moveToElement(ele5).perform();
		driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenshotFolder\\"+"ss3"+".png");
		Files.copy(src, dest);
		driver.quit();		
}

}
