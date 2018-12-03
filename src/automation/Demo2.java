package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
	ChromeDriver cd =new ChromeDriver ();
	Thread.sleep(1000);
	cd.close();

	}

}
