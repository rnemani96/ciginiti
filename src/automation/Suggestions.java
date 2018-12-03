package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(1000);
		
		//To get address of all suggestion
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		
		//To get size of all suggestions
		int count=allSuggestions.size();
		System.out.println(count);
		
		//To print all Suggestions
		for(WebElement suggestion:allSuggestions)
		{
			String text=suggestion.getText();
			System.out.println(text);
		}
		
		//To click on last suggestion
		WebElement s=allSuggestions.get(count-1);
		s.click();
		driver.close();
		}
	}

