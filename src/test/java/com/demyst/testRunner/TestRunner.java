package com.demyst.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"."},
    plugin = {
      "pretty",
      "html:target/site/cucumber-pretty",
      "json:target/cucumber/cucumber.json",
      "usage:target/usage.jsonx",
      "junit:target/cucumber.xml"
    },
    glue = {
            "com/demyst/stepDefinations","com.demyst.base"
    }
     
    //		dryRun = true ,
    //		strict =true,
    //		tags = {" @Regression ,@Sanity" },
    //    monochrome = true)
    )
public class TestRunner {

}

