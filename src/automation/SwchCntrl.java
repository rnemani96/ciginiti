package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwchCntrl {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			if(title.contentEquals("ICON Clinical Research"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
	}

}
