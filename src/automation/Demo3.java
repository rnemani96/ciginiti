package automation;

import org.openqa.selenium.opera.OperaDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver", "G:\\cigniti\\cigniti\\drivers\\operadriver.exe");
		OperaDriver o =new OperaDriver();//update opera
		Thread.sleep(1000);
		o.close();
	}

}
