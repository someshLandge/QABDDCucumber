package Runner_Pack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features", 
		glue = {"utility","stepDefinition"}, 
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		tags = "@singleTest",
		 monochrome = true 
		)
public class Run {

}
