package com.wordpress.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.base.TestBase;

public class Wp_Dashboard extends TestBase{
	
	@FindBy(xpath="//span[@class='display-name' and contains(text(),'asentechssg')]")
	WebElement userlable;
	
	@FindBy(xpath="//div[contains( text(),'Posts')]")
	WebElement post;
	
	@FindBy(xpath="//a[@class='page-title-action']")
	WebElement AddNewPost;
	
	@FindBy(xpath="//label[@id='title-prompt-text']")
	WebElement PostTitle;
	
	
	
	public Wp_Dashboard() throws IOException 
	   {
			PageFactory.initElements(driver, this);	
	   }
	
	public String vefifytitle()
	{
		return driver.getTitle();
		
	}
	public boolean verifyusername()
	{
		return userlable.isDisplayed();
	}
	
	public Wp_AllPostPage clickonAddPost() throws IOException
	{
	
      post.click();
      return new Wp_AllPostPage();
	}
	

	
}
