package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBrick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		String xp="//a[.='RedBrick Health']/../..//a[.='About Us']";
		Thread.sleep(1000);
		WebElement aboutUs=driver.findElement(By.xpath(xp));
		
		Actions act = new Actions(driver);
		act.moveToElement(aboutUs).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Company']")).click();
		
		driver.close();
	}

}
