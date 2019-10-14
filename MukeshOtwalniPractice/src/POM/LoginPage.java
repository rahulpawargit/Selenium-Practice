package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	WebDriver driver;
	
	By username= By.name("username");
	By password= By.name("password");
	By button= By.xpath("//input[@type='submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeusername(String uid)
	{
	driver.findElement(username).sendKeys(uid);	
	}

	public void crmlogin(String uname, String pass) throws InterruptedException
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(button).click();
	}
	
	/*public void typepassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickbutton()
	{
			driver.findElement(button).click();
	}*/
}
