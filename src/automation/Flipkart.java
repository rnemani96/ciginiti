package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement cl = driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']"));
		cl.click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(1000);
		
		//To get address of all sugg
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
		
		//To get the size of all sugg
		int count = allSugg.size();
		System.out.println(count);
		
		//To print all sugg
		for(WebElement Sugg:allSugg)
		{
			 String text = Sugg.getText();
			 System.out.println(text);
		}
		
		driver.close();
		
	

	}

}
