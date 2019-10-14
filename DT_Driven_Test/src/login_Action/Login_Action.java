package login_Action;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

import excelUtilities.excelUti;


	public class Login_Action {
		
		public static void succesfullLogin(WebDriver driver) throws Exception{
			 
			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

			String sUserName = excelUti.getCellData(1, 1);

			String sPassword = excelUti.getCellData(1, 2);

			driver.findElement(By.name("name")).sendKeys(sUserName);

			driver.findElement(By.name("password")).sendKeys(sPassword);

			driver.findElement(By.name("insert")).click();
			
	    }
	}

