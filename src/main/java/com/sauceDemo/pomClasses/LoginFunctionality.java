package com.sauceDemo.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality 
{
	public WebDriver driver;
	
	//usename
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	//password
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//login button
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login;
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public LoginFunctionality(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
}
