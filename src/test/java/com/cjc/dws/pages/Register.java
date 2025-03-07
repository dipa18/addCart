package com.cjc.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	public WebDriver driver;
	public  Register(WebDriver driver)
	{
		this.driver= driver;
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement passwrd;
	
	@FindBy(className = "button-1 login-button")
	WebElement login;
	
	public void registerClick(String Email,String Password)
	{
		
		email.sendKeys(Email);
		passwrd.sendKeys(Password);
	
	}
	
	}

