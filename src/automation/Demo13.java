package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		
		d.get("http://127.0.0.1/login.do");
		d.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		//d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.cssSelector("a[id='loginButton']")).click();
		//d.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(1000);
		d.close();
		

	}

}
