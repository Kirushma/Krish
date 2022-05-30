package com.cucuadactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucuadactin\\feature", glue = "com\\cucuadactin\\stepdefinition",
plugin = {"pretty","html:htmlReport", "json:Report/cucumber.json", 
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"})

public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = Base.browserLaunch("chrome");

	}

	@AfterClass
	public static void tearDown() {

		driver.close();

	}

}
