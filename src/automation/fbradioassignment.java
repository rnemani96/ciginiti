package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbradioassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		
		d.navigate().to("https://www.facebook.com/");
		// WebElement c = d.findElement(By.id("u_0_a"));
		 WebElement c = d.findElement(By.id("u_0_9"));
		 			c .click();
		 if(c.isSelected())
		 {
			 System.out.println("female is checked");
		
		 }
		 else
			 System.out.println("female is unchecked");
		 Thread.sleep(1000);
		 
		 d.close();

	}

	
}
