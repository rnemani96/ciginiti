package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
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
		
		//Select by index
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		//Select by value
		sel.selectByValue("p");
		Thread.sleep(1000);
		
		//Select by text
		sel.selectByVisibleText("Fish");
		Thread.sleep(1000);
		
		//Deselect by index
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		
		//Deselect by value
		sel.deselectByValue("p");
		Thread.sleep(1000);
		
		//Deselect by text
		sel.deselectByVisibleText("Fish");
		Thread.sleep(1000);

		driver.close();
	}

}
