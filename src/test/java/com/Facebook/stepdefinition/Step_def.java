package com.Facebook.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Facebook.runner.Runner_class1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_def {
	 
	static WebDriver driver = Runner_class1.driver;
	@Given("user Launch The Facebook Application Url")
	public void user_launch_the_facebook_application_url() {

	    driver.get("https://www.facebook.com/index.php/");
		
	}
	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
		
		driver.findElement(By.id("email")).sendKeys("gopal");
	    
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
	
		driver.findElement(By.id("pass")).sendKeys("Pass@123");
	}
	@Then("user Click The Login Button And Navigate To Next Page")
	public void user_click_the_login_button_and_navigate_to_next_page() {
	  
		  driver.findElement(By.name("login")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
