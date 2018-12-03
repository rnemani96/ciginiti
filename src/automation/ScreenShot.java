package automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://demo.actitime.com/login.do");
			
			
			//Create reference of take screenshot
			TakesScreenshot t=(TakesScreenshot) driver;
			
			//To take the screenshot
			   File src = t.getScreenshotAs(OutputType.FILE);
			
			//To create destination
			File dest=new File("./screenshot.png");
			
			//To copy the file from src to dest
			FileUtils.copyFile(src, dest);
			driver.close();
	}

}