package com.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Welcome_Page extends TestBase{
	
	public Welcome_Page ()throws IOException
	   {
			PageFactory.initElements(driver, this);	
	   }
}
