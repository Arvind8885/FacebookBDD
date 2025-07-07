package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features = {"src/test/java/feature/facebookreg.feature"},
	glue= {"stepDefination"},
	dryRun = false,
	plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
	
		)


public class RunnerTest extends AbstractTestNGCucumberTests {

}
