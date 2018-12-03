package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginirctc {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.findElement(By.id("loginbutton")).click();
		Alert a=driver.switchTo().alert(); 
		Thread.sleep(1000);
		
		//To get text
		String text=a.getText();
		System.out.println(text);
		
		//To click on OK
		a.accept();
		driver.close();
	}

}
