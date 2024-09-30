package com.Facebook.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\Maven-cucumber\\Facebook_11.30am_batch\\src\\test\\java\\com\\Facebook\\feature\\facebook.feature", glue = "com.Facebook.stepdefinition", publish = true, 
plugin = {"pretty",
		"html:Reports/Cucumber_reports"})

public class Runner_class1 {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/index.php/");

	}

	@AfterClass
	public static void browserclose() {

		driver.close();

	}

}
