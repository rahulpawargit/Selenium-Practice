package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestScenario_3_TestCase_2 {
  
	public WebDriver driver=new FirefoxDriver();
	@Test
  public void openpage() //Test Case-1- Verify Page Title
	{
		driver.manage().window().maximize();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		//Get the page title 
		String title=driver.getTitle();
		//verify page title is "Registrer Page"
		Assert.assertTrue(title.contains("Register page"));

	}
	@Test(priority=0)
	public void registraion()//Test case-2-Register user and check the welcome mesasge.
	{
	    //Add first page data and move to next page 
		driver.findElement(By.name("name")).sendKeys("Rahul");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.name("confirmpassword")).sendKeys("12345");
        driver.findElement(By.name("insert")).click();
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Reg2"));
	}
	
	@Test(priority=1)
	public void basicdetails()
	{
		//Add Second page data and move next page.
		driver.findElement(By.name("First_Name")).sendKeys("Rahul");
		driver.findElement(By.name("Last_Name")).sendKeys("Rahul");
		WebElement drp1=driver.findElement(By.name("Birthday_day"));
		new Select(drp1).selectByVisibleText("18");
		WebElement drp2=driver.findElement(By.name("Birthday_Month"));
		new Select(drp2).selectByVisibleText("May");
		WebElement drp3=driver.findElement(By.name("Birthday_Year"));
		new Select(drp3).selectByVisibleText("1999");
		driver.findElement(By.name("Email_Id")).sendKeys("rahul@gmail.com");
		driver.findElement(By.name("Mobile_Number")).sendKeys("rahul@gmail.com");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
		driver.findElement(By.name("insert")).click();
		String title=driver.getTitle();
        Assert.assertTrue(title.contains("Reg3"));
	}
	
	@Test(priority=2)
	public void addressdetails()
	{
	    //Add 3rd page data like Address details and move to fill next page.
		driver.findElement(By.name("Address")).sendKeys("Sr.No-123/, Flat No 5, Urit Nagar");
		driver.findElement(By.name("City")).sendKeys("Pune");
		driver.findElement(By.name("Pin_Code")).sendKeys("412514");
		driver.findElement(By.name("State")).sendKeys("MH");
		WebElement drp2=driver.findElement(By.name("Country"));
		new Select(drp2).selectByVisibleText("India");
		driver.findElement(By.name("insert")).click();
		
	}
	
	@Test(priority=3)
	public void hobbis()
	{
		//Fill the user hobbies data and complete the registrion process.
		String title=driver.getTitle();
        Assert.assertTrue(title.contains("Reg4"));
        driver.findElement(By.name("Hobby_Drawing")).click();
        driver.findElement(By.name("Hobby_Singing")).click();
        driver.findElement(By.name("Hobby_Cooking")).click();
        driver.findElement(By.name("insert")).click();
	}
	@Test(priority=4)
	public void verifymessage()
	{
		//Test Case-3 Verify welcome Message
		//Get message details and Verify message.
		String message=driver.findElement(By.xpath("html/body/h1")).getText();
		Assert.assertTrue(message.contains("Welcome To Selenium Automation Testing"));
		//Close the driver or browser.
		driver.quit();
		
	}
}
