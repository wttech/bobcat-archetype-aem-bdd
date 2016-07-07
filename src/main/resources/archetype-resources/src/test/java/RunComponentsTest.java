#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/features/components", format = { "pretty",
        "html:target/cucumber-components-html-report", "json:target/cucumber-components-report.json" })
public class RunComponentsTest {
    // empty
}