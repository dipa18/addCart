package com.cjc.dws.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;


public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}

	@FindBy(xpath = "//*[@id=\"gender-female\"]")
	WebElement gen;
	
	@FindBy(name = "FirstName")
	WebElement fname;
	
	@FindBy(name = "LastName")
	WebElement lname;
	
	@FindBy(name = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement pass;
	
	@FindBy(name = "ConfirmPassword")
	WebElement cpass;
	
	@FindBy(name = "register-button")
	WebElement register;
	
	public void loginCheck(String FirstName,String LastName,String Email,String Password,String ConfirmPassword)
	{
		gen.click();
		fname.sendKeys(FirstName);
		lname.sendKeys(LastName);
		email.sendKeys(Email);
		pass.sendKeys(Password);
		cpass.sendKeys(ConfirmPassword);
		register.click();
		
	}	
	
}
