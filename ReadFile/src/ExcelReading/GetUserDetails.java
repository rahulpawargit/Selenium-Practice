package ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Row;


public class GetUserDetails 
{
	
	public WebDriver driver;
	
  @BeforeTest
  public void Openbroweser()
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	
  }
  
  @Test(dataProvider="login")
  public void verifylogin(String userName, String Password)
  {
	  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  driver.findElement(By.name("name")).sendKeys("userName");
      driver.findElement(By.name("password")).sendKeys("Password"); 
      driver.findElement(By.name("insert")).click();
  }
  
  
  
  
  @DataProvider(name="login")
  public Object[][] logindata()
  {
	  Object[][] arrayObject = getExcelData("D://Rahul/Testing Docs/Selenium Setup/TestData.xlsx","Sheet1");
		return arrayObject;
  }
  
  public String[][] getExcelData(String filename, String sheetName)
  {
	  String[][] arrayExcelData=null;
	  
	  try
	  {
		  FileInputStream file=new FileInputStream("D://Rahul//Testing Docs//Selenium Setup//TestData.xlsx");
		   Workbook wb=WorkbookFactory.create(file);
		   Sheet sh=wb.getSheet("Sheet1");
		   
		   int totalNcls=sh.getColumns();
		   int totalNoOfRows =  sh.getRows();
		  
		    for(int row=0; row < totalNoOfRows; row++ )
		    		{
		    	         for (int col=0; col < totalNcls ; col++)
		    	         {
		    	        	 arrayExcelData[row-1][col] = sh.getCell(row, col).getContents();
		    	         }
		    		}
		  
	  }
	  catch (FileNotFoundException e) {
			e.printStackTrace();
			
			return arrayExcelData;
	  }
  }
	  
	  @Test
		public void tearDown() {
			driver.quit();
		}
  
}

