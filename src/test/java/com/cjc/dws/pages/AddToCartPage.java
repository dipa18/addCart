package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {
	
	public WebDriver driver;
	 public AddToCartPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input") 
	 WebElement cont;
	 
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	 WebElement adtocart;
	 
	 @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	 WebElement clickshopingcart;

	 public void adtocart() {
		 cont.click();
		adtocart.click();
		clickshopingcart.click();
		 
	 }
}
