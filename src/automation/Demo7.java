package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//to maximize window
		driver.manage().window().maximize();
		
		//to enter url using get
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		//to enter url using naviate
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		
		
		//to go to back page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to go to forward page
		driver.navigate().forward();
		Thread.sleep(1000); 
		
		//to refresh the current page
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//to close the web page
		driver.close();
		

	}

}
