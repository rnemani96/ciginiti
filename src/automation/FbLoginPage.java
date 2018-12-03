package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FbLoginPage {
	//declaration
	
	@FindBy(id="email")
	private WebElement Lid;
	
	@FindBy(id="pass")
	private WebElement Lpw;
	
	@FindBy(xpath="//input[@id='u_0_2']")
	private WebElement logBTN;
	
	@FindBy(xpath="//input[@id='u_0_j']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@id='u_0_l']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@id='u_0_o']")
	private WebElement Mobno;
	
	@FindBy(name="reg_passwd__")
	private WebElement newpass;
	
	@FindBy(id="day")
	private WebElement bday;
	
	@FindBy(id="month")
	private WebElement bmon;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(id="u_0_9")
	private WebElement gen1;
	
	@FindBy(id="u_0_a")
	private WebElement gen2;
	
	
	//inialization
	
	public FbLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	public void enterUserName(String LUN)
	{
		Lid.sendKeys(LUN);
	}
	public void enterPassWord(String LPW)
	{
		Lpw.sendKeys(LPW);
	}
	public void clickOnLogIn()
	{
		logBTN.click();
	}
	public void enterFName(String Fn)
	{
		Fname.sendKeys(Fn);
	}
	public void enterLName(String Ln)
	{
		Lname.sendKeys(Ln);
	}
	public void entermobno(String mob)
	{
		Mobno.sendKeys(mob);
	}
	public void enterpass(String npass)
	{
		newpass.sendKeys(npass);
	}
	public void enterday(String d)
	{
		Select sel =new Select(bday);
		   sel.selectByValue(d);
	}
	
	public void entermon(String m)
	{
		Select sel = new Select(bmon);
		sel.selectByVisibleText(m);
	}
	
	public void enteryear(String y)
	{
		Select sel =new Select(year);
		sel.selectByVisibleText(y);
	}
	public void entergen()
	{
		gen1.click();
	}
	public void genmale()
	{
		gen2.click();
	}
}
