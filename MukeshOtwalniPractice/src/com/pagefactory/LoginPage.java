package com.pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 

{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//*[@id='identifierId']") 
	WebElement username;
	
	@FindBy(xpath="//*[@id='identifierNext']/content")
	WebElement Nextbutton1;

	@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input")
	WebElement password;

	@FindBy(xpath="//*[@id='passwordNext']/content/span")
	WebElement Nextbutton2;
	
	@FindBy(xpath="//*[@id=':4d']")
	 WebElement openmail;
	
	public void login(String uid, String pass) throws InterruptedException
	{
		username.sendKeys(uid);
		Nextbutton1.click();
		//Thread.sleep(2000);
		
				
	  WebDriverWait wait = new WebDriverWait(driver,30);
      //wait.until(ExpectedConditions.visibilityOfElementLocated(password.sendKeys(pass));
             
     	
				
				
		password.sendKeys(pass);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		Nextbutton2.click();
		
		//openmail.click();
	}
}
