package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDnD {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/droppable/");
	
	driver.findElement(By.xpath("//p[@class='desc']/.."));
	driver.switchTo().frame(0);
	
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	act.dragAndDrop(src, target).perform();
	Thread.sleep(1000);
	
	driver.close();
	}

}

