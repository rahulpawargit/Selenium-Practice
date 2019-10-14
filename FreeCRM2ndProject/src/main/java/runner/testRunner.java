package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "com.feature" //the path of the feature files
		//features = "E://Rahul//Testing Docs//Selenium//FreeCRMBDDFramework//src//main/java//Features//logins.feature", //the path of the feature files
		//glue={"stepDefination"}, //the path of the step definition files
		//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		//monochrome = true, //display the console output in a proper readable format
		//strict = true, //it will check if any step is not defined in step definition file
		//dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
		
		
				//features = "/Users/NaveenKhunteta/Documents/workspace/FreeCrmBDDFramework/src/main/java/Features/taggedhooks.feature", //the path of the feature files
		,glue={"LoginstepDefination"} //the path of the step definition files
		
		
		)
public class testRunner {

	


}
