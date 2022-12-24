package com.auto.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.auto.basepage.MyBaseClass;
import com.auto.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeTestSteps extends MyBaseClass {

	

	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	
	@Given("I open the browser")
	public void i_open_the_browser() throws InterruptedException, IOException {
		MyBaseClass.setUp();
	    
	}

	
	@When("I enter {string} and {string}")
	public void i_enter_and(String email, String password) {
	    
	    pf.getEmail().sendKeys(email);
	    pf.getPassword().sendKeys(password);
	}
    
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	   pf.getLoginButton().click(); 
	    
	}
	

    @Then("I am suppose to get an error message")
    public void i_am_suppose_to_get_an_error_message() {
	String expected = "Epic sadface: An internal error has occured and has been logged";
	String actual = driver.findElement(By.xpath("//*[@class='error']")).getText();
			Assert.assertEquals(actual, expected);
    
}

	
}


