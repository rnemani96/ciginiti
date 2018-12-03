package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Css_Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\cigniti\\cigniti\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAMYA/Desktop/demohtml.html");
			driver.findElement(By.cssSelector("/html/body/div[1]/input[1]]"));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[2]]"));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[2]/input[1]]"));
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("/html/body/div[2]/input[2]]"));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[]]"));
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("/html/body/div[2]/input[]]"));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[1]] | /html/body/div[2]/input[1]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[2]] | /html/body/div[2]/input[2]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[1]] | /html/body/div[2]/input[d]] "));
			Thread.sleep(1000);

			driver.findElement(By.cssSelector("/html/body/div[1]/input[2]] | /html/body/div[2]/input[1]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[]] | /html/body/div[2]/input[1]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[]] | /html/body/div[2]/input[2]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[1]] | /html/body/div[2]/input[]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[1]/input[2]] | /html/body/div[2]/input[]] "));
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("/html/body/div[]/input[] "));
			Thread.sleep(1000);
			
			driver.close();



	}

}
