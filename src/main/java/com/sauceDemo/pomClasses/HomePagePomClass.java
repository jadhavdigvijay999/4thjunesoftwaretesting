package com.sauceDemo.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass 
{
	public WebDriver driver;
	
	//go to menu
	
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']" )
	private WebElement menu;
	
	public void clickOnMenu()
	{
		menu.click();
	}
	
	//logout element
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	
	
	//addtocart functionality
	
	//select product
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart;
	
	public void clickOnAddToCart()
	{
		addtocart.click();
	}
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement cart;
	public String getorderText()
	{
		return cart.getText();
	}
	
	public HomePagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
}
