package com.QED42Assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assesment1 
{
	
	 WebDriver driver;
	
	@BeforeMethod()
	public void BrowserSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

}
	@Test()
	public void SelectOrangeDress()
	{
		
	}
}
