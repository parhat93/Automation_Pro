package com.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		plugin= {"pretty",                                           // how u report looks like, it is going to show your report
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@Create_account",
		features="src/test/resources/com/app/features/",
		glue="com/app/steps_definitions",
		dryRun = false
		)
public class CukesRunner extends AbstractTestNGCucumberTests {

}
