package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Form.html");
		
		WebElement fname=driver.findElement(By.id("fn"));
		if(fname.isEnabled())
		{
			System.out.println("enabled---");
		}
		else
		{
			System.out.println("disabled---");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
