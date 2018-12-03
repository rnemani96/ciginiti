package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Dob_Fb {

	public static void main(String[] args) throws InterruptedException {
		
		//program to select dob from fbdrop downlist
		
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100,TimeUnit.MILLISECONDS);
		d.get("file:///C:/Users/RAMYA/Desktop/websites/Facebook%20%E2%80%93%20log%20in%20or%20sign%20up.html");
		
		
		
		WebElement fb1 = d.findElement(By.id("day"));
		Select day =new Select(fb1);
		Thread.sleep(1000);
		day.selectByVisibleText("30");
		
		WebElement fb2 = d.findElement(By.id("month"));
		Select mon=new Select(fb2);
		Thread.sleep(1000);
		mon.selectByVisibleText("Sept");
		
		WebElement fb3 = d.findElement(By.id("year"));
		Select year=new Select(fb3);
		Thread.sleep(1000);
		year.selectByVisibleText("1996");
		Thread.sleep(1000);
		
		//d.close();
		}

}
