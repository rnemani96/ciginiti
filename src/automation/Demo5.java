package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter browser:(IE,gc)");
		WebDriver Driver = null; // UPCASTING BROSWERTYPE(CROME AND IE ) TO WEBDRIVER
		
		String option = sc.next();
		
		if(option.equals("gc"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
			Driver  = new ChromeDriver();
			
		}
		else if(option.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "G:\\cigniti\\cigniti\\drivers\\IEDriverServer.exe");
			Driver  = new InternetExplorerDriver();
			
			
		}
		Thread.sleep(1000);
		Driver.close();
		

	}

}
