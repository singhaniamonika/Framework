package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Runner file used to run the cucumber feature file

@RunWith(Cucumber.class)  
@CucumberOptions(features="features",glue= "stepDefinition",
plugin= {"html:target/cucumber-html-report"}
)
public class TestRunner {
	
	

}
