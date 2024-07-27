package org.fbtest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources" , glue = "org.fbtest" , monochrome = true , dryRun = false)
public class TestRunnerfb {

}
