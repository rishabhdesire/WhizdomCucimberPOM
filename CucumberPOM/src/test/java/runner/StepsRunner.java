package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/",
		// features = "@rerun/failed_scenarios.txt", to re execute failed test cases
		glue = { "search", "select" }, plugin = { "html:target/cucumber-reports.html",
				"rerun:rerun/failed_scenarios.txt" }, // pretty,progress,html.json,rerun,junit
		monochrome = true, dryRun = false, tags = "@CarTrading")

public class StepsRunner extends AbstractTestNGCucumberTests {

}
