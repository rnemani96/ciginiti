package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaildemoassignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		
		d.get("http://www.gmail.com/login");
		//d.findElement(By.id(""))
		
		
		
		
		
	}

}
