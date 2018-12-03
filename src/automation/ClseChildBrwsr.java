package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClseChildBrwsr {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String pWh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		allWh.remove(pWh);
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(1000);
		}
		driver.switchTo().window(pWh);
		Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).click();
		}
		
	}


