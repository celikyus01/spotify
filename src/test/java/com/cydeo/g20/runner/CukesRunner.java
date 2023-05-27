package com.cydeo.g20.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt",
                "pretty"},
        features = "src/test/resources/features",
        glue = "com/cydeo/g20/stepDefs",
        strict = false,
        dryRun = false,
        tags = "@wip"
        //optional

)
public class CukesRunner {
}
