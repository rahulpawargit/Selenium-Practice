package com.TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment {

	
WebDriver driver;
	
	@Test
	public void OpenBrowser() throws InterruptedException
	{
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.get("https://aptitude.ur-nl.com/companies/5bf3aa07ba169e98b9321bfd/company_assessments/5bf3e05dba169ef9a1321c73/user_company_assessments/5bf4ff95ba169edd3e321cc1/?auth_token=R2VfqzBPBPZPywFVASus");
	
	//driver.findElement(By.xpath("//a[contains(@class,'btn-warning large-10 medium-14 small-18 mat-button mat-raised-button') and contains(@tabindex,'0')]")).click();
	
	
	
 // WebDriverWait wait = new WebDriverWait(driver,30);
 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@tabindex='0']")));
	
	Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@tabindex='0']")).click();
  Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@tabindex='0']")).click();	
  driver.findElement(By.className("module-cta")).click();
  driver.findElement(By.className("mat-radio-outer-circle")).click();
  driver.findElement(By.className("mat-button-wrapper")).click();
  Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@tabindex='0']")).click();
  
  
	
	
	
	}
}
