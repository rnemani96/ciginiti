package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="G:\\cigniti\\cigniti\\drivers\\geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver f = new FirefoxDriver();//update firefox
		Thread.sleep(1000);
		f.close();
		
		
		
		
		

	}

}
