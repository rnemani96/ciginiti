package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel3 {
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
		
		//To select the options
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		//To get the address of all selected options
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		
		//TO count no of selected options
		int count=allOptions.size();
		System.out.println(count);
		
		//To print all selected options
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			System.out.println(text);
		}
		Thread.sleep(1000);
		driver.close();
		}

	}
