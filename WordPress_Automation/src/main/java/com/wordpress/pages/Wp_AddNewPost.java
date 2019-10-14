package com.wordpress.pages;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wordpress.base.TestBase;

public class Wp_AddNewPost extends TestBase {
	
	private static final String JavascriptExecutor = null;

	@FindBy(xpath="//*[@id='title-prompt-text']")
	WebElement postheading;
	
	@FindBy(xpath="//*[@id='acf-field-sub_heading_title']")
	WebElement postsubheading;
	
	//@FindBy(xpath="//*[@id='tinymce' and @class='mce-content-body acf_settings post-type-post post-status-auto-draft post-format-standard page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']")
	//@FindBy(css="##content")
	@FindBy(xpath="//textarea[@class='wp-editor-area' and @id='content']")
	WebElement posteditor;
	
	@FindBy(xpath="//*[@id='excerpt']")
	WebElement postexcerpt;
	
	@FindBy(xpath="//*[@id='post_author_override']/option[2]")
	WebElement postauthor;
	
	@FindBy(xpath="//*[@id='publish']")
	WebElement postpublish;
	
	@FindBy(xpath="//*[@id='content-tmce']")
	WebElement ClickonVisual;
	
	@FindBy(xpath="//*[@id='content-html']")
	WebElement ClickOnText;
	
	@FindBy(xpath="//button[@type='button' and @id='content-html']")
	WebElement clickText;
	
	

	public Wp_AddNewPost() throws IOException 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	public Wp_AllPostPage addpost() throws IOException, InterruptedException
	{
		Actions actions = new Actions(driver);
//		actions.moveToElement(postheading);
//		actions.click();
//		actions.sendKeys("Test Heading ");
//		actions.build().perform();
//		//postheading.sendKeys("Test Heading");
//		postsubheading.sendKeys("Test Sub heading");
		ClickonVisual.click();
	    System.out.println("Clicked on Text");
	    driver.switchTo().frame("content_ifr");
	    posteditor.clear();
	   
	    
	    
	     posteditor.sendKeys("<h1>Heading</h1>Yi Zeng");
	    
//	    actions.click();
//	    actions.sendKeys("Textediton conente");
//	    actions.build().perform();
//	    
	   //System.out.println("Switched in Frame");
	   
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//return wait.until(ExpectedConditions.invisibilityOfElementLocated(posteditor.sendKeys("Article body")));
	//	Thread.sleep(3000);
	//	posteditor.click();
		
	  // posteditor.sendKeys("This is texteditor text");
	   System.out.println("Entered text in editor");
	   driver.switchTo().defaultContent();
		
		
		
		
		//actions.moveToElement(posteditor).click().build().perform();
	//	posteditor.click();
	//	System.out.println("Focus on editor");
		//posteditor.sendKeys("Testing keywoird");
//	WebDriverWait wait = new WebDriverWait(driver,30);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(posteditor.sendKeys("Article body")));
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			    .ignoring(NoSuchElementException.class);
//
//			WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
//			{
//			  public WebElement apply(WebDriver driver) 
//			 {
//			  return posteditor;
//			 }
//			});
		
		//clickText.click();
	   
	   
	   
//	   driver.switchTo().frame("content_ifr");
//	   WebElement element = driver.findElement(By.cssSelector("##content"));
//	   (JavascriptExecutor)driver.executeScript("arguments[0].innerHTML = '<h1>Set text using innerHTML</h1>'", element);
//	   
//	   (JavascriptExecutor)driver.executeScript("tinyMCE.activeEditor.setContent('<h1>Native API text</h1> TinyMCE')");
	   
	   
	 //  js.executeScript("document.posteditor.value='someValue';");
	 //  js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");*
		
	
		
	
	    postexcerpt.sendKeys("excerpt");
		//postauthor.click();
		//postpublish.click();
		return new Wp_AllPostPage();
	}

	
}
