package com.sauceDemo.TestClasses;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.pomClasses.LoginFunctionality;



public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void loginFunctionality() 
	{ 
		  //validation
		   
		   String Expected="Swag Labs";
		   String actual=driver.getTitle();
		   System.out.println("Title of home page:"+actual);
		   Assert.assertEquals(actual, Expected);
		     
		   System.out.println("test is called");

	}

}
