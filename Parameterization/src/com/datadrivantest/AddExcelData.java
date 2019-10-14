package com.datadrivantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ExcelReader;

public class AddExcelData {

	public static void main(String[] args)
	{
		ExcelReader reader= new ExcelReader("E:\\Rahul\\Testing Docs\\Selenium\\Parameterization\\src\\com\\testdata\\amazondata.xlsx");
		int rowcount = reader.getRowCount("sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
	    driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=NMD7VSS3JPRVQS7GQK7A&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  
	    reader.addColumn("sheet1", "Status");
	    
	    for(int rcnt=2; rcnt <= rowcount;  rcnt++)
	    {
	    	 String Firstname= reader.getCellData("sheet1", "Name", rcnt);
	   		    System.out.println(Firstname); 
	   		    
	   		 String Mobileno= reader.getCellData("sheet1", "MobileNo", rcnt);
			   System.out.println(Mobileno); 
			    
			   String email= reader.getCellData("sheet1", "Email", rcnt);
			   System.out.println(email);
			   
			   String password= reader.getCellData("sheet1", "Password", rcnt);
			   System.out.println(password); 
			   
			   
			   driver.findElement(By.id("ap_customer_name")).clear();;
			    driver.findElement(By.id("ap_customer_name")).sendKeys(Firstname);
			    
			    driver.findElement(By.id("ap_phone_number")).clear();
			    driver.findElement(By.id("ap_phone_number")).sendKeys(Mobileno);
			    
			    driver.findElement(By.id("ap_email")).clear();
			    driver.findElement(By.id("ap_email")).sendKeys(email);
			    
			    driver.findElement(By.id("ap_password")).clear();
			    driver.findElement(By.id("ap_password")).sendKeys(password);
			    
			    reader.setCellData("sheet1", "Status", rcnt, "Pass");
			    
	    	
	    }
		
		
	}

}
