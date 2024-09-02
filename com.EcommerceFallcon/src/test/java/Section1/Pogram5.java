package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pogram5 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
	    Thread.sleep(2000);
	    String text=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/div/div[@aria-disabled='false' and @aria-selected ='true']/div/p[@class=' todayPrice']")).getText();
	    System.out.println(text);
		
	}

}
