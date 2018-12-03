package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locaters {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAMYA/Desktop/sample.html");
		
		//by using id
		driver.findElement(By.id("fp")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//by using name
		driver.findElement(By.name("forgot")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//by using classname
		driver.findElement(By.className("pass")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		//by tagname as tagame of various links can be same it gives the one which comes first so we use
		//link text attribute
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		// by link name
		driver.findElement(By.linkText("Forgot password???")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//by partial link name is used when the text is dynamic we use static part of the linktext
		driver.findElement(By.partialLinkText("Inbox")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.close();
		

	}

}
