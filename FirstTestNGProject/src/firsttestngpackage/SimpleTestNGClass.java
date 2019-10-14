package firsttestngpackage;

import org.testng.annotations.Test;
  import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.AfterMethod;
  import org.testng.annotations.BeforeClass;
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.BeforeTest;
  import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeSuite;
  import org.testng.annotations.AfterSuite;

  public class SimpleTestNGClass {
    @Test(priority=11)
    public void LoginTest() {
  	  System.out.println("In LoginTest");
    }
    
    @AfterClass
    public void LoginTest1() {
  	  System.out.println("In LoginTest1");
    }
    
    @Test(priority=9)
    public void beforeMethod() {
  	  System.out.println("In beforeMethod");
    }

    @Test(priority=8)
    public void afterMethod() {
  	  System.out.println("In afterMethod");
    }

    @Test(priority=7)
    public void beforeClass() {
  	  System.out.println("In beforeClass");
    }

    @Test(priority=6)
    public void afterClass() {
  	  System.out.println("In afterClass");
    }

    @Test(priority=5)
    public void beforeTest() {
  	  System.out.println("In beforeTest");
    }

    @Test(priority=4)
    public void afterTest() {
  	  System.out.println("In afterTest");
    }

    @Test(priority=3)
    public void beforeSuite() {
  	  System.out.println("In beforeSuite");
    }

    @Test(priority=1)
    public void afterSuite() {
  	  System.out.println("In afterSuite");
    }

  }

