package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_xpath_ruby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.navigate().to("https://www.seleniumhq.org/download/");
	
		d.findElement(By.xpath("//tr/td[text()='Ruby']/../td[4]")).click();//td is column of table and tr is row
		Thread.sleep(1000);
		d.close();
		

	}

}
