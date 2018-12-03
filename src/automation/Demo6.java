package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver Driver =new ChromeDriver();
		
		//to maximize the browser
				Driver.manage().window().maximize();
		 
		//to open the required url in the browser 
		Driver.get("https://www.google.com");
		
		//to get the title of the url from broswer
		String title=Driver.getTitle();
		System.out.println("title :"+title);
		
		//to get the current url from the browser
		String url=Driver.getCurrentUrl();
		System.out.println("url :"+url);
		
		Thread.sleep(1000);
		Driver.close();
		
		
		 
		
		
	}

}
