package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		//to select email feild in fb
		driver.findElement(By.cssSelector("input[type='email']"));
		//to select password feild from login in fb
		driver.findElement(By.cssSelector("input[name='pass']"));
		// to select firstname from signup
		driver.findElement(By.cssSelector("input[name='firstname']"));
		//to select lastname from signup
		driver.findElement(By.cssSelector("input[name='lastname']"));
		//to select emailor mobile from signup
		driver.findElement(By.cssSelector("input[id='u_o_o']"));
		//to select newpassword form signup
		driver.findElement(By.cssSelector("input[name='reg_passwd_']"));
		//to select day from signup
		driver.findElement(By.cssSelector("input[id='day']"));
		//to select month from signup
		driver.findElement(By.cssSelector("input[id=''month]"));
		//to select year from signup
		driver.findElement(By.cssSelector("input[id='year']"));
		//to select signup from signup
		driver.findElement(By.cssSelector("button[type='submit']"));
		
		driver.close();
		

	}

}
