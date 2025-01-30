package com.demyst.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/demyst/feature", // Corrected feature file path
        glue = {
                "com.demyst.stepDefinations",
                "com.demyst.base"
        },
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber/cucumber.json",
                "usage:target/usage.jsonx",
                "junit:target/cucumber.xml"
        },
        tags = "@html or @non-html", // Make sure this tag is in the feature file
        dryRun = false, // Set to false to actually run tests
        monochrome = true, // Improve console output readability
        publish = true // Enable publishing of reports to Cucumber.io
)
public class TestRunner {
}
