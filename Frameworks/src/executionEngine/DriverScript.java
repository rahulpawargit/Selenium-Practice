package executionEngine;

import KeywordDrivenFramewords.ActionKeyword;

import utility.ExcelUtils;

public class DriverScript {

    public static void main(String[] args) throws Exception {
    	// Declaring the path of the Excel file with the name of the Excel file
    	String sPath = "D://Rahul//Testing Docs//Selenium//Frameworks//src//KeywordDrivenFramewords//DataEngine.xlsx";

    	// Here we are passing the Excel path and SheetName as arguments to connect with Excel file 
    	ExcelUtils.setExcelFile(sPath, "Test Steps");

    	//Hard coded values are used for Excel row & columns for now
    	//In later chapters we will replace these hard coded values with varibales
    	//This is the loop for reading the values of the column 3 (Action Keyword) row by row
    	for (int iRow=1;iRow<=9;iRow++){
		    //Storing the value of excel cell in sActionKeyword string variable
    		String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

    		//Comparing the value of Excel cell with all the project keywords
    		if(sActionKeyword.equals("openBrowser")){
                        //This will execute if the excel cell value is 'openBrowser'
    			//Action Keyword is called here to perform action
    			ActionKeyword.openBrowser();}
    		else if(sActionKeyword.equals("navigate")){
    			ActionKeyword.navigate();}
    		else if(sActionKeyword.equals("input_userName")){
    			ActionKeyword.input_userName();}
    		else if(sActionKeyword.equals("input_Password")){
    			ActionKeyword.input_Password();}
    		else if(sActionKeyword.equals("input_Cpassword")){
    			ActionKeyword.input_Cpassword();}
    		else if(sActionKeyword.equals("click_Login")){
    			ActionKeyword.click_Login();}
    		else if(sActionKeyword.equals("waitFor")){
    			ActionKeyword.waitFor();}
    		
    		else if(sActionKeyword.equals("closeBrowser")){
    			ActionKeyword.closeBrowser();}

    		}
    	}
 }
