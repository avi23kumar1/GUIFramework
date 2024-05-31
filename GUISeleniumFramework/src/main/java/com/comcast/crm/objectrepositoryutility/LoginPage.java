package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement getUsername() {
			return username;
		}


		public WebElement getPassword() {
			return password;
		}


		public WebElement getSubmitbutton() {
			return submitbutton;
		}
		@FindBy(name = "username")
		private WebElement username;
		@FindBy(name = "password")
		private WebElement password;
		@FindBy(name = "submit")
		private WebElement submitbutton;
	
	                                             
	
	
/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 */

		public void loginadmin( String username1 , String password1) { 
			username.sendKeys(username1);
			password.sendKeys(password1);
			submitbutton.click();
		 }
		public void logindoctor(String username1 , String password1) {
			username.sendKeys(username1);
			password.sendKeys(password1);
			submitbutton.click();
		 }
		public void loginpatient(String username1 , String password1) {
			username.sendKeys(username1);
			password.sendKeys(password1);
			submitbutton.click();
		 }	
	
	
}
