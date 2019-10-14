package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.confige.Configuration;

public class screenshotTest extends Configuration
{
	
	

	@BeforeMethod
	public void setup()
	{
		initilisation();
	}
	
	@Test
	public void verifyTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "CRMPRO", "Home title not matching");
	}
	
	
	
}
