package Loginpage;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import excelUtilities.excelUti;
import inputFile.InputFileDetails;
import login_Action.Login_Action;


	public class Login {
		
		public static void main(String[] args) throws Exception {
			 
	        /*This is to open the Excel file. 
			Excel path, file name and the sheet name*/
	 
			excelUti.setExcelFile(InputFileDetails.Path_TestData + InputFileDetails.File_TestData,"Sheet1");
	 
	        WebDriver driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get(InputFileDetails.URL);
	 
	        Login_Action.succesfullLogin(driver);
	 
	        System.out.println("Login Successfully");
	 
	        driver.quit();
	 
	        //Writing result into Excel sheet.
	 
	        excelUti.setCellData("Pass", 1, 5);
	 
			}
	}


