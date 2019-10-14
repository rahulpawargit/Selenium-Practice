package com.wordpress.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.base.TestBase;

public class Wp_LoginPage extends TestBase 
{
	//Pgae Factory
	
	@FindBy(id="user_login")
	static
	WebElement username;
	
	@FindBy(id="user_pass")
	static
	WebElement password;
	
	@FindBy(id="wp-submit")
	static
	WebElement loginbutton;
	
	@FindBy(xpath="//a[@title ='NjBiz']")
	static WebElement logo;
	
	
	@FindBy(id="rememberme")
	WebElement remebermecheckbox;
	
	@FindBy(linkText="Lost your password?")
	WebElement forgotlink;
	
	
	

	public Wp_LoginPage() throws IOException 
   {
		PageFactory.initElements(driver, this);
		
   }
	
	public static String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifylogo()
	{
		return logo.isDisplayed();
	}
	
	public static Wp_Dashboard login(String uname, String pass) throws IOException
	{
	
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
		return new Wp_Dashboard();
	}
	

}
