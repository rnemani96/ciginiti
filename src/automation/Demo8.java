package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//to navigate to webpage
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to close all the parent and child browsers only if it is opened by selenium but not by us 
		//example open naukri website
		driver.quit();

	}

}
