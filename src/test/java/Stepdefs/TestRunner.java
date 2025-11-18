package Stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/featureFiles/enroll.feature",
		"src/test/resources/featureFiles/login.feature" },

// path to your .feature files
		glue = { "Stepdefs" }, // package containing step definitions
		plugin = { "pretty", "html:target/cucumber-report.html" }, // reporting plugins
		monochrome = true, // cleaner console output
		tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {
	// No need for @BeforeClass or @AfterAll here — Hooks handle driver lifecycle
}
