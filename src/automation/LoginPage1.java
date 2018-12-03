package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {

	
		//declaration
		private WebElement unTB;
		private WebElement pwTB;
		private WebElement loginBTN;
		
		//intialisation
		public LoginPage1(WebDriver driver)
		{
			unTB=driver.findElement(By.id("username"));
			pwTB=driver.findElement(By.name("pwd"));
			loginBTN=driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
			
		}
		//utilisation
		public void enterUserName(String UN)
		{
			unTB.sendKeys(UN);
		}
		public void enterPassWord(String PW)
		{
			pwTB.sendKeys(PW);
		}
		public void clickOnLogin()
		{
			loginBTN.click();
		}
		

	

}
