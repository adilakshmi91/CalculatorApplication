package com.calculator.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile/Calculator.Feature", glue= {"com.calculator.stepDefinition"} ,plugin = {
"html:Reports/cucumber-calculator-report" })

public class CalculatorRunner {
	

}
