package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//will go and search for feature file
		//to run only one feature file: features ="src/test/java/Features/Login.feature",
		features ="src/test/java/Features",
		//parameter to define stepDefinition file name
		glue = "stepDefinitions/stepDFromTestRunner2")
public class TestRunner2 {

}
