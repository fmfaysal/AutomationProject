package com.auto.hooks;


import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;

import com.auto.basepage.MyBaseClass;


public class Hook extends MyBaseClass {
	//Initialize starts the browser before every scenario
	@BeforeMethod
	public static void initialize() {
		MyBaseClass.setUp();	
	}
	
	//tearDown will quit the browser after every scenario


	@AfterMethod
	public static void tearDown() {
		driver.quit();
		
	}

}
