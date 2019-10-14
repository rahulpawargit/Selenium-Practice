package com.wordpress.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.base.TestBase;

public class Wp_AllPostPage extends TestBase {
	
	@FindBy(xpath="//a[@class='page-title-action']")
	static
	WebElement addnewpost;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/table/tbody/tr[1]/td[1]/div[3]/span[1]/a")
	static
	WebElement editpost;
	

	public Wp_AllPostPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String veritypagetitle()
	{
		return driver.getTitle();
		
	}

	public static Wp_AddNewPost clickonAddPost() throws IOException
	{
		addnewpost.click();
		return new Wp_AddNewPost();
		
	}
	
	public static void clickonEditPost()
	{
		editpost.click();
	}
	
	
}
