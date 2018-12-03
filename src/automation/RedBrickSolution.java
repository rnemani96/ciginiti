package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBrickSolution {
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
		String rb = "//a[.='RedBrick Health']/../..//a[.='Solutions']";
		WebElement solution = driver.findElement(By.xpath(rb));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.moveToElement(solution).perform();
		Thread.sleep(3000);
		List<WebElement> allSoln = driver.findElements(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']"));
		
		int count = allSoln.size();
		System.out.println(count);
		
		for(WebElement Soln:allSoln)
		{
			String text = Soln.getText();
			System.out.println(text);
		}
		
		driver.close();

		
	}

}
