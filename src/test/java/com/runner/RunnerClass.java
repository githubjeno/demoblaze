package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.baseclass.BaseClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ashin\\eclipse-workspace\\demoblaze\\src\\test\\java\\com\\features\\orderproduct.feature",
                   glue="com.stepdefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerClass {
     @BeforeClass
	 public static void runner() {
		BaseClass.browserLaunch("edge");
	}
}
