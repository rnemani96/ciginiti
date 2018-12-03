package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
//		U get stale Element exception
//		unTB=driver.findElement(By.id("username"));
//		pwTB=driver.findElement(By.name("pwd"));
//		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
//Refer EncapActi
}
