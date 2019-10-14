package com.datadrivantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ExcelReader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		//driver.findElement(By.id("ap_customer_name")).sendKeys("Rahul");
	//	driver.findElement(By.id("ap_phone_number")).sendKeys("9762035715");
		
		ExcelReader reader=new ExcelReader("E:\\Rahul\\Testing Docs\\Selenium\\Parameterization\\src\\com\\testdata\\amazondata.xlsx");
	     
		String Firstname= reader.getCellData("sheet1", "Name", 2);
		System.out.println(Firstname);
		
		String Number=reader.getCellData("sheet1","MobileNo", 2);
		System.out.println(Number);
		
		String email=reader.getCellData("sheet1","Email", 2);
		System.out.println(email);
		
		String password=reader.getCellData("sheet1","password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
	    driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=NMD7VSS3JPRVQS7GQK7A&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  
	    driver.findElement(By.id("ap_customer_name")).sendKeys(Firstname);
	    driver.findElement(By.id("ap_phone_number")).sendKeys(Number);
	    driver.findElement(By.id("ap_email")).sendKeys(email);
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	    
	    
	}
	

}
