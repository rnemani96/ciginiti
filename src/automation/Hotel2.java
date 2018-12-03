package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Hotel.html");
		WebElement hotel=driver.findElement(By.id("maarya"));
		Select sel=new Select(hotel);
		Thread.sleep(1000);
		
		if(sel.isMultiple())
		{
			System.out.println("multi-select");
		}
		else
		{
			System.out.println("single-select");
		}
		driver.close();
	}

}