package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		
		d.get("file:///C:/Users/RAMYA/Desktop/Automation%20html/demo5.html");
		d.manage().window().maximize();
		
		List<WebElement> ch =d.findElements(By.cssSelector("input[type='checkbox']"));
		int count=ch.size();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++) {
			
			 WebElement a=ch.get(i);
			 a.click();
			 Thread.sleep(1000);
			 
			// System.out.println(a); 
		}
		
		
		
		Thread.sleep(1000);
		//this is for reverse order  exection of checkbox
		for(int i=count-1;i>=0;i--) {
			 WebElement a=ch.get(i);
			 a.click();
			 Thread.sleep(1000);
			
		}
		
		for(int i=0;i<count;i=i+2) {
			
			 WebElement a=ch.get(i);
			 a.click();
			 Thread.sleep(1000);
			 
			// System.out.println(a); 
		}
		
		
		for(int i=0;i<count;i=i+1) {
			
			 WebElement a=ch.get(i);
			 a.click();
			 Thread.sleep(1000);
			 
			// System.out.println(a); 
		}
		
		
		

	}
	
}
