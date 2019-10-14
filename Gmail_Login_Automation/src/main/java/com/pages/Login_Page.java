package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Login_Page extends TestBase
{
	

	@FindBy(xpath="//*[@type='email']")
	static
	  WebElement emialid;
	
	@FindBy(xpath="//*[@class='RveJvd snByac']")
	 static WebElement nextbtn1;
	
	@FindBy(xpath="//*[@type='password']")
	 static WebElement password;

	 
    @FindBy(xpath="//*[@class='RveJvd snByac']")
    static WebElement nextbtn2;
   
    public Login_Page() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
    
    
    public static Welcome_Page login(String uname,String pass) throws IOException
    {
    	emialid.sendKeys(uname);
    	nextbtn1.click();
    	password.sendKeys(pass);
    	nextbtn2.click();
		return new Welcome_Page();
    	
    }
    
 
	

}
