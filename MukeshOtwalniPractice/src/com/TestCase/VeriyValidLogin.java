package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.config.BrowserFactory;
import com.pagefactory.LoginPage;

public class VeriyValidLogin {
	
	
	@Test
	public void checkvaliduser() throws InterruptedException
	{
		WebDriver driver= BrowserFactory.startbrowser("Chrome","https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//WebDriver driver= BrowserFactory.startbrowser("Chrome","url");
		LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);	
        
        loginpage.login("rahul.pawar.asentech@gmail.com"," Abcd$123");
        
        driver.close();
	}

}
