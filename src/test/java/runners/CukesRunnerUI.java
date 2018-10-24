package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {
				"html:target/NinjaReport/cucumber-pretty",
				"json:target/cucumber.json"
				},
			
				
		tags = "@jani",
		features= "src/test/resources/testData",
		glue= "step_definitions.ui",
		dryRun=false
		
		
)
public class CukesRunnerUI extends AbstractTestNGCucumberTests {
	

}
