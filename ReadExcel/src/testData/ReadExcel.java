package testData;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadExcel
{
	public WebDriver driver;
	
  @Test(dataProvider="testdata")
  public void readfile(String Username, String Password,String CPassword) 
  {
	  new FirefoxDriver();
	  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  driver.findElement(By.name("name")).sendKeys(Username);
      driver.findElement(By.name("password")).sendKeys(Password);
      driver.findElement(By.name("confirmpassword")).sendKeys(CPassword);
      driver.findElement(By.name("insert")).click();
	  
  }
  @DataProvider(name="testdata")
  public Object [] [] readExcel() throws BiffException, IOException
  {
	 File f=new File("D:\\Rahul\\Testing Docs\\Selenium\\TestData.xlsx"); 
	 Workbook wb=Workbook.getWorkbook(f);
	 Sheet s=wb.getSheet("Sheet1");
	 
	 int rows=s.getRows();
	 int cls=s.getColumns();
	 
	 String inputData[][]= new String [rows][cls];
	 
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<cls;j++)
		 {
			 Cell c=s.getCell(j,i);
			 inputData[i][j]=c.getContents();
			 
		 }
	 }
	 return inputData;
  }
}
