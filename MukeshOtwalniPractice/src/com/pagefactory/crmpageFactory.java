package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class crmpageFactory {
	
	WebDriver driver;

@FindBy(name="username") 
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="@input[type='submit']")
WebElement button;

public crmpageFactory(WebDriver driver)
{
	this.driver=driver;
	
}

public void crmlogin(String un, String pass) throws InterruptedException
{
	username.sendKeys(un);
	password.sendKeys(pass);
	Thread.sleep(3000);
	button.click();
}


}
