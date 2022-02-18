package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber_Proj.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features_Cuc\\Adactin.feature",
				glue = "com.step_Def",
				monochrome = true,
				dryRun = false,
				strict= false,
				tags=("~@RegressionTest"),
				
				plugin = {"html:Report","json:Json","junit:Junit",
	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class Runner_Class {
	
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
		driver = Base.browserlaunch("Chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
//		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
