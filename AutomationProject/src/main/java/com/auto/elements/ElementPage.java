package com.auto.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.basepage.MyBaseClass;


public class ElementPage extends MyBaseClass {


public ElementPage(){
	PageFactory.initElements(driver, this);	
}

//How to store the elements 
//Encapsulation in our framework. We want to make our elements private


@FindBy(xpath = "//*[@type='text']")
@CacheLookup
private WebElement email;

public WebElement getEmail() {
	return email;
}


@FindBy(xpath = "//*[@type='password']")
@CacheLookup
private WebElement password;
public WebElement getPassword() {
	return password;
}

@FindBy(xpath = "//*[@class='button']")
private WebElement LoginButton;

public WebElement getLoginButton() {
	return LoginButton;
}


}
