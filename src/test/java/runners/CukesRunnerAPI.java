package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {
				"html:target/NinjaReport/cucumber-pretty",
				"json:target/cucumber.json"
				},
			
			
		tags ="@ApiGet",
		features= "src/test/resources/testData",
		glue= "step_definitions.api",
		dryRun=false 
)
public class CukesRunnerAPI extends AbstractTestNGCucumberTests {
	

}
