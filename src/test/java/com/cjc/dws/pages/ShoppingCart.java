package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
	
	public WebDriver driver;
	 public ShoppingCart(WebDriver driver)
	{
		this.driver= driver;
	}
	
@FindBy(xpath = "//*[@id=\"CountryId\"]")
WebElement country;

//@FindBy(xpath = "//*[@id=\"StateProvinceId\"]")
//WebElement state;

@FindBy(xpath = "//*[@id=\"termsofservice\"]")
WebElement agree;

@FindBy(xpath = "//*[@id=\"checkout\"]")
WebElement checkout;

public void shopingcart() throws InterruptedException
{
	
	Select s= new Select(country);
	s.selectByVisibleText("Canada");
	Thread.sleep(2000);
	agree.click();
	checkout.click();
	
	
}
	

}
