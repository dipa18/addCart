package com.cjc.dws.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import org.testng.annotations.Test;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cjc.dws.pages.AddToCartPage;
import com.cjc.dws.pages.CheckoutPage;
import com.cjc.dws.pages.LoginPage;
import com.cjc.dws.pages.Register;
import com.cjc.dws.pages.ShippingAddPage;
import com.cjc.dws.pages.ShoppingCart;


public class DemoWebShopTest {
		
public WebDriver driver;
	
	@Test(priority = 1)
	public void testLoginTest() 
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dipal\\Downloads\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	
	}
	
	
	@Test(dataProvider = "logindata",priority=2)
	public void Login(String firstName, String lastName, String email, String password, String confirmPassword)
	{
	LoginPage lp= PageFactory.initElements(driver, LoginPage.class);
	lp.loginCheck(firstName, lastName, email, password, confirmPassword);
	}
	
	//@Test(priority = 3)
//	public void register1() {
		
	//	Register re= PageFactory.initElements(driver, Register.class);
		//re.registerClick();
		
	@Test(priority = 3)
		
	public void addtocart() {
		
		AddToCartPage adc= PageFactory.initElements(driver, AddToCartPage.class);
		adc.adtocart();
	}
	
	@Test(priority = 4)
	
	public void shopingcart() throws InterruptedException {
		
		ShoppingCart shpc= PageFactory.initElements(driver, ShoppingCart.class);
		shpc.shopingcart();
	}
	
	@Test(priority = 5)
	
	public void checkout() throws InterruptedException {
		
		CheckoutPage che= PageFactory.initElements(driver, CheckoutPage.class);
		che.checkout();	
		
	}
	
	@Test(priority = 6)
	
	public void shippingadd() throws InterruptedException {
		
		ShippingAddPage shipad= PageFactory.initElements(driver, ShippingAddPage.class);
		shipad.shippingadd();
		
		
	}
	
	@DataProvider
	public Object [] [] logindata()
		{
			return new Object [] []
					{
				new Object [] {"Dipali","patel","dipalibpatel136@gmail.com","Test@abc","Test@abc"}
		
					};
		}
	
}