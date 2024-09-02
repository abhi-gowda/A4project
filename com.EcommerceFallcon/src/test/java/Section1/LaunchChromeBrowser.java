package Section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws Exception {
String exceptedData = "demoapps";
String exceptedTitle = "DemoApps";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		String actualDataUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		System.out.println(actualDataUrl);
		System.out.println(actualTitle);
		if(actualTitle.contains(exceptedTitle) && actualDataUrl.contains(exceptedData)) {
			System.out.println("accessed demoapps successfully!!");
		}else {
			System.out.println("not accessed!!");
		}
		Thread.sleep(1000);
		driver.close();
	}

	}
