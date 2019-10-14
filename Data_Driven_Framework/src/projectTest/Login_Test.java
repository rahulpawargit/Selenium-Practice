package projectTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import inputTestData.TestDataConstant;
import pageClasses.Login_Page_Action;
import utilities.*;

public class Login_Test {
	
	public static void main(String[] args) throws Exception {
		 
        /*This is to open the Excel file. 
		Excel path, file name and the sheet name*/
 
        ExcelUtilities.setExcelFile(TestDataConstant.Path_TestData + TestDataConstant.File_TestData,"Sheet1");
 
        WebDriver driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get(TestDataConstant.URL);
 
        Login_Page_Action.succesfullLogin(driver);
 
        System.out.println("Login Successfully");
 
        driver.quit();
 
        //Writing result into Excel sheet.
 
        ExcelUtilities.setCellData("Pass", 1, 5);
 
		}
}
