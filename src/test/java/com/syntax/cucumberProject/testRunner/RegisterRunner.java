package com.syntax.cucumberProject.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Registeration.feature"
	,glue="com.syntax.cucumberProject.stepDefinition"
	,dryRun=true)
public class RegisterRunner {

}
