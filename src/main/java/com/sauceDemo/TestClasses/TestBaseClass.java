package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.pomClasses.LoginFunctionality;
import com.utility.ScreenShotClass;

public class TestBaseClass 
{
	public WebDriver driver;
	
	Logger log=Logger.getLogger("SaouceDemo");
	
	@Parameters("browsername")
	@BeforeClass
	public void LaunchBrowser(String browsername) throws IOException
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./DriversFiles\\chromedriver.exe");
	 	   
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./DriversFiles\\geckodriver.exe");
		 	   
			driver=new FirefoxDriver();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		   log.info("browser is launched");
	 	   driver.manage().window().maximize();
	 	   log.info("Window is maximized");
	 	   driver.get("https://www.saucedemo.com/");
		   log.info("URL is opened");
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   ScreenShotClass.screenshot(driver);
		   
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		   //Loginpage Elements find + Action perform
		   LoginFunctionality login=new LoginFunctionality(driver);
		   login.sendUsername();
		   System.out.println("username is entered");
		   login.sendPassword();
		   System.out.println("password is entered");
		   login.clickOnLogin();
		   System.out.println("clicked on login button");
		   System.out.println("login successfully");
		   System.out.println("Before method is called");
		   ScreenShotClass.screenshot(driver);
	}
	
//	@AfterMethod
//	public void Logout()
//	{
//		driver.close();
//	}
//	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//		System.out.println("browser is closed");
//		System.out.println("After method is called");
//	}
}
