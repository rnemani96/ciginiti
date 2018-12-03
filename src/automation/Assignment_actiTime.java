package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_actiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(8000);
		
		d.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//div[contains(text(),'Accounting')]/../../..//div[contains(@class,'img')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(text(),'task selected')]/..//div[contains(@class,'deleteButton')]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//div[contains(@class,'cancelBtn greyButton')]")).click();
		Thread.sleep(2000);
		d.close();
	}

}
