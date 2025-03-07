package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingAddPage {
	
	public WebDriver driver;
	 public ShippingAddPage(WebDriver driver)
	{
		this.driver= driver;
	}
	 
	// @FindBy(xpath = "//*[@id=\"PickUpInStore\"]")
	 //WebElement checkmark;
	 
	@FindBy(css= "#billing-buttons-container > input")
	
	WebElement con;
	
	@FindBy(css = "#shipping-buttons-container > input")
	WebElement shippingaddrs;

	@FindBy(css = "#shipping-buttons-container > input")
	
	WebElement shippingmethod;
	 
	@FindBy(css = "#shipping-method-buttons-container > input")
	
	WebElement paymentmethod;
	
	@FindBy(css = "#payment-method-buttons-container > input")
	
	WebElement paymentInformation;
	
	@FindBy(css = "#payment-info-buttons-container > input")
	
	WebElement confirmOrder;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement confirm;
	
	 public void shippingadd() throws InterruptedException {
		 
	Thread.sleep(2000);
		 con.click();
		 
		// Thread.sleep(2000);
		 //sshippingaddrs.click();
		 
		 Thread.sleep(2000);
		 shippingmethod.click();
		 
		 Thread.sleep(2000);
		 
		 paymentmethod.click();
		 
		 Thread.sleep(4000);
		 paymentInformation.click();
		 
		 Thread.sleep(2000);
		 confirmOrder.click();
		 
		 Thread.sleep(2000);
		 confirm.click();
	}
}
