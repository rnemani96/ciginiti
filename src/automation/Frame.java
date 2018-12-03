package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Page1.html");
		driver.findElement(By.id("fn")).sendKeys("Padma");
		Thread.sleep(1000);
		
		//To switch into frame; page2.html
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("Shree");
		Thread.sleep(1000);
	
		//To switch to default webpage;page1.html
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("V");
		Thread.sleep(1000);
		
		driver.close();
	}

}
