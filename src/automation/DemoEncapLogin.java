package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoEncapLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage1 lp=new LoginPage1(driver);
		lp.enterUserName("admin");
		lp.enterPassWord("manager");
		lp.clickOnLogin();
		Thread.sleep(9000);
		driver.close();
		
		

	}

}
