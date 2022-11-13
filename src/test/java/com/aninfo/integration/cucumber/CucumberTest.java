package com.aninfo.integration.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber", glue = {"com.aninfo.integration.cucumber"})
public class CucumberTest {}
