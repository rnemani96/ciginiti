package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		d.get("http://127.0.0.1/login.do;jsessionid=2nug8d6j7hev2");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		
		
		d.findElement(By.xpath("//span[contains(text(),'Help & Support')]")).click();
		
		d.findElement(By.xpath("//div[contains(text(),'About actiTIME')]")).click();
		
		
		WebElement build = d.findElement(By.xpath("//td[contains(text(),'3.3 (build 17573), Auto-installation package')]"));
		
		System.out.println(build);
		
	}

}
