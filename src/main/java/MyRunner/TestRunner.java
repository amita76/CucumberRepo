package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; //add manually

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false, //true: checks for mapping is perfect between feature and stepDefinition; default-false
		features = "C:/Users/asaraf/workspace2/Cucumber-BDDFramework/src/main/java/features/tagged_hooks.feature", // which feature file to run
		glue = {"stepDefinition"},   // location of selenium file 
		plugin = { "pretty" , "html:target/output-result"},  // folder is created for 
						//json add "json:json_output/cucumber.json" and for junit "junit:junit_xml/cucumber.xml"
		monochrome = true,		// the output is displayed in readable format
		strict =true  //checks for pending steps strictly
	//	tags={"@SmokeTest" , "@RegressionTest" , "@End2End"} // And //tags: instruct which tags from feature file should be executed
	//	tags={"@SmokeTest , @RegressionTest , @End2End"}  // OR
	//	tags={"@SmokeTest" , "~@RegressionTest" , "@End2End"}  // not
		)

public class TestRunner {

}
