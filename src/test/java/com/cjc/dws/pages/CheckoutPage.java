package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	public WebDriver driver;
	 public CheckoutPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")	 
WebElement cntry;

@FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
	WebElement city;

@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
WebElement addrs1;

@FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
WebElement zipcode;

@FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
WebElement phoneno;

@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
WebElement contn;


public void checkout() throws InterruptedException {
	
	Select s= new Select(cntry);
	s.selectByVisibleText("Canada");
	
	city.sendKeys("Pune");
	addrs1.sendKeys("karevenagar");
	zipcode.sendKeys("456434");
	phoneno.sendKeys("9887675659");
	
	//Thread.sleep(2000);
	//contn.click();
	
	//Thread.sleep(2000);
	
}
	 
}
