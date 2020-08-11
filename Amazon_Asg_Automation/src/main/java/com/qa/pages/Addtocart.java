package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Addtocart extends TestBase
{
//	Page Factory	
	@FindBy(xpath="//a[@title='Add to Shopping Cart']")
	WebElement addtocart;
	
	@FindBy(id="breadcrumb-back-link")
	WebElement backtoresult;
	
	@FindBy(xpath="//span[@class= 'nav-cart-count nav-cart-1']")
	WebElement gotocart;
	
	@FindBy(xpath="//input[@class='a-button-input' and @name='proceedToCheckout']")
	WebElement proceedtopay;
	
	
	
//	inilitilize the object
	
	public Addtocart()
	{
		PageFactory.initElements(driver,this);
	}

	
	public signup proceedtopay()
	{
		
		
		proceedtopay.click();
		return new signup();
	}
}
	
