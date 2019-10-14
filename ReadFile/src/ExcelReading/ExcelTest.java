package ExcelReading;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelTest {
  @Test
  public void readexcel() 
  {
	
	  try
	  {
	   FileInputStream file=new FileInputStream("D://Rahul//Testing Docs//Selenium Setup//TestData.xlsx");
	   Workbook wb=WorkbookFactory.create(file);
	   Sheet sh=wb.getSheet("Sheet1");
	   Row ro=sh.getRow(1);
	   Cell cl=ro.getCell(0);
	   System.out.println(cl);
	   String cellvalue=cl.getStringCellValue();
	   System.out.println(cellvalue);
	  }
	  catch(Exception e)
	  {
		  
	  }
	  
  }
}
