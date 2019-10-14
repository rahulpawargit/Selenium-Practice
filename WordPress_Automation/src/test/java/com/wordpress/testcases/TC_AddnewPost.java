package com.wordpress.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.base.TestBase;
import com.wordpress.pages.Wp_AddNewPost;
import com.wordpress.pages.Wp_AllPostPage;
import com.wordpress.pages.Wp_Dashboard;
import com.wordpress.pages.Wp_LoginPage;

public class TC_AddnewPost extends TestBase
{

  Wp_LoginPage loginpage;
  Wp_Dashboard dashboard;
  Wp_AllPostPage allpostpage;
  Wp_AddNewPost addpost;
  
	
	public TC_AddnewPost() throws IOException
	{
		super();
		
	}
    @BeforeMethod()
	public void setup() throws IOException
	{
		initilization("chrome");
		loginpage=new Wp_LoginPage();
		dashboard= Wp_LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dashboard=new Wp_Dashboard();
		allpostpage=dashboard.clickonAddPost();
		addpost=new Wp_AddNewPost();
	}
    
//    @Test(priority=1)
//    public void verifytitle()
//    {
//    	String title= allpostpage.veritypagetitle();
//    	Assert.assertEquals(title, "Posts < NJBiz - WordPress");
//    	
//    }
    
    @Test(priority=1)
    public void addnewpost() throws IOException, InterruptedException
    {
    	//allpostpage.clickonAddPost();
    //	String title= allpostpage.veritypagetitle();
      //  Assert.assertEquals(title, "Posts < NJBiz - WordPress");
    	Wp_AllPostPage.clickonAddPost();
    	System.out.println("I am on Add new  post page");
    	//String title=allpostpage.veritypagetitle();
    	//Assert.assertEquals( title, "Add New Post < NJBiz - WordPress");
    	Thread.sleep(2000);
    	addpost.addpost();
    	
    }
    
//    @Test(priority=1)
//    public void editpost()
//    {
//    	Wp_AllPostPage.clickonEditPost();
//    	System.out.println("I ma on edit post page");
//    }
    
//    @AfterMethod()
//    public void closebrowser()
//    {
//    	driver.close();
//    }
}
