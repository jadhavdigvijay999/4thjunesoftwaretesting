package com.sauceDemo.TestClasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.sauceDemo.pomClasses.HomePagePomClass; 
public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogout()
	{
		HomePagePomClass home=new HomePagePomClass(driver);
		home.clickOnMenu();
		home.clickOnLogout();
		System.out.println("logout successfully");
		
		//validation
		String expected="Swag Labs";
		String actual=driver.getTitle();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
	}
}
