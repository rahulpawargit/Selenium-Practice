package testpack;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.*;


	public class Openbrowser {

	    public static void main(String[] args) {
	        
	       
	        
	      // driver.get("http://www.google.com");
	      // String url = "https://www.google.com";
	      // String script = "window.location = \'"+url+"\'";
	       WebDriver driver = new FirefoxDriver();
	       alert("Brower opened");
	       driver.navigate().to("http://www.google.com/");
	      //((JavascriptExecutor) driver).executeScript(script);
	    	//InternetExplorerDriver driver = new InternetExplorerDriver();
	        
	    	driver.manage().window().maximize();
	       
	        
	    }

		private static void alert(String string) {
			// TODO Auto-generated method stub
			System.out.println("TEST");
			
			
		}

	}


