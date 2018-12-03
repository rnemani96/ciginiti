package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:\\cigniti\\cigniti\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		driver.get("https://www.facebook.com/");
		FbLoginPage lp =new FbLoginPage(driver);
		lp.enterUserName("rajesh");
		lp.enterPassWord("hai");
		lp.enterFName("rajesh");
		lp.enterLName("nemani");
		lp.entermobno("9494039936");
		lp.enterpass("123456789");
		lp.enterday("30");
		lp.entermon("Sept");
		lp.enteryear("1996");
		lp.genmale();
		//lp.entergen();
		
	}

}
