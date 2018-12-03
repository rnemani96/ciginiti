package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		//TO right click
		act.contextClick(link).perform();
		Thread.sleep(5000);
		
		//To press keys
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_T);
		driver.close();
	}
}
