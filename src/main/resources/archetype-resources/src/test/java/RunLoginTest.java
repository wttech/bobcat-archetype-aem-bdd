#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/features/login", format = { "pretty",
		"html:target/cucumber-login-html-report", "json:target/cucumber-login-report.json" })
public class RunLoginTest {
	// empty
}