package com.auto.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.auto.basepage.MyBaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 

@CucumberOptions(
	    features = {"Features /NegativeTestLogin.feature"},
		glue = {"com.auto.stepdefinition", "com.auto.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		
			
	)

public class Runner extends AbstractTestNGCucumberTests {
	@BeforeClass
	@Parameters("browserType")
	public static void beforeClass(@Optional("chrome") String browser)   {
	    new MyBaseClass();
		MyBaseClass.initializeProperties();		
		MyBaseClass.property.setProperty("BrowserType", browser);
	}
	
    @AfterClass
	public static void afterClass() {
		
	}
	

	
	
}
