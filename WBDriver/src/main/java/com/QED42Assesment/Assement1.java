package com.QED42Assesment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assement1 {
	
	
		
		 WebDriver driver;
		
		@BeforeMethod()
		public void BrowserSetup()
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

	}
		@Test(priority=1)
		public void SelectOrangeDress()
		{
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id='layered_id_attribute_group_13']")).click();
			List<WebElement> list = driver.findElements(By.xpath("//*[@class='color_pick']"));
			Assert.assertTrue(list.size() > 0);
				
		}
		
		@Test(priority=2)
		public void SelectPolyster() throws InterruptedException
		{
			
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id='layered_id_feature_1']")).click();
			Thread.sleep(2000);
			String polysterURL=driver.getCurrentUrl();
			assertEquals(polysterURL, "http://automationpractice.com/index.php?id_category=8&controller=category#/compositions-polyester", "Polyster Product Availabe");
			
		}
		
		@AfterMethod()
		public void closebrowser()
		{
			driver.close();
		}
		
		
	


}
