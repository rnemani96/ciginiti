package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/GeckoDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/V%20Padmashree/Desktop/Cigniti/Form.html");
		
		WebElement submit=driver.findElement(By.id("s"));
		Thread.sleep(1000);
		
		//To click on submit button
		submit.submit();
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement fname=driver.findElement(By.id("fn"));
		
		//To enter the text
		fname.sendKeys("Padma");
		Thread.sleep(1000);
		
		//To clear the text
		fname.clear();
		
		WebElement fb=driver.findElement(By.linkText("Facebook"));
		
		//To get TagName of the element
		String tag = fb.getTagName();
		System.out.println("TagName:"+tag);
		
		//To get attribute value of an element
		String value = fb.getAttribute("href");
		System.out.println("Attribute Value:"+value);
		
		//to get the text of an element
		String text = fb.getText();
		System.out.println("Text:"+text);
		
		//To get color of an element
		String color=fb.getCssValue("color");
		System.out.println("color:"+color);
		
		//To get font size of an element
		String size=fb.getCssValue("font-size");
		System.out.println("Size:"+size);
		
		driver.close();

	}

}
