package com.qa.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class Checkout_process extends TestBase{
	
	//PageFactory
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	WebElement imagelogo;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox' and @name='field-keywords']")
	WebElement searchbox;
	
	@FindBy(css=".nav-search-submit")
	WebElement searchitem;
	
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']")
	WebElement selectitem;
	
	@FindBy(css="#add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(id="breadcrumb-back-link")
	WebElement backtoresult;
	
	@FindBy(css="#hlb-ptc-btn-native")
	WebElement proceedtopayout;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']	")
	WebElement createaccount;
	
	@FindBy(xpath= "//input[@id='ap_customer_name']")
	WebElement custname;
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement mobileno;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElement re_password;
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement submit;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email_for_Login;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_to_Login;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password_for_login;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin_for_Login;
	
	
	//intilization webelement
	public Checkout_process()
	{
		PageFactory.initElements(driver, this);
	}

	//Verify the Title of page
	public String ValidateTitle()
	{
		return driver.getTitle();
	}
    
	//Verify the Logo of page
	public boolean imagelogo()
	{
		return imagelogo.isDisplayed();
	}
	
	
	//Search items and checkout process
	public Addtocart browse(String item) throws InterruptedException
	{
		//Search the 1st Item
		//searchbox.sendKeys(item);
		searchbox.sendKeys("watches for men");
		WebElement searchbutton=searchitem;
		searchbutton.click();
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='s-result-list s-search-results sg-row']")));
		selectitem.click();
		addtocart.click();
		Thread.sleep(20);
		
		
		//Search the 2nd item
		searchbox.sendKeys("sunglasses for men");
		WebElement searchbutton1=searchitem;
		searchbutton1.click();
		WebElement myDynamicElement1 = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='s-result-list s-search-results sg-row']")));
		selectitem.click();
		addtocart.click();
		Thread.sleep(10);
		proceedtopayout.click();
	
		//Create Account
//        createaccount.click();
//		
//		//Sign in
		email_for_Login.sendKeys("amazontesing1@gmail.com");
		continue_to_Login.click();
		password_for_login.sendKeys("amazon12!@");
		signin_for_Login.click();
		
		
		//Signup Process
//		custname.sendKeys("Testing");
//        //mobileno.sendKeys("9762035716");
//		emailid.sendKeys("amazontesing1@gmail.com");
//		password.sendKeys("amazon12!@");
//		re_password.sendKeys("amazon12!@");
//		submit.click();
//		
		return new Addtocart();
	}
}
