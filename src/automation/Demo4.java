package automation;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "G:\\cigniti\\cigniti\\drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		Thread.sleep(1000);
		ie.close();

	}

}
