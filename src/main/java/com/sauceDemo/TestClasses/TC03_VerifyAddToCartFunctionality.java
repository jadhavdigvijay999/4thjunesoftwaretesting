package com.sauceDemo.TestClasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.sauceDemo.pomClasses.HomePagePomClass;
public class TC03_VerifyAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verifyAddToCart()
	{
		HomePagePomClass home=new HomePagePomClass(driver);
		home.clickOnAddToCart();
		System.out.println("product is added");
		
		
		String expected="5";
		
		String actual=home.getorderText();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
	}
}
