package org.example.test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        plugin= {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},
        glue="org.example.steps"
        ,tags={"@Demo"}
)
public class TestRunner {
}
