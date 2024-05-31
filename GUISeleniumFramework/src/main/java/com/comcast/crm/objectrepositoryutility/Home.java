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
public class Home extends WebDriverUtility{                             
                           
	WebDriver driver;
	 public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath ="//a[@href='hms/user-login.php']")
	WebElement patients;
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getPatients() {
		return patients;
	}


	public WebElement getDoctorslogin() {
		return doctorslogin;
	}


	public WebElement getAdminlogin() {
		return adminlogin;
	}


	public WebElement getContact() {
		return contact;
	}
	@FindBy(xpath ="//a[@href='hms/doctor/']")
	private WebElement doctorslogin ;
	@FindBy(xpath ="//a[@href='hms/admin']")
	private WebElement adminlogin ;
	@FindBy(xpath ="//a[@href='contact.php']")
	private WebElement contact ;
	@FindBy(xpath = "//img[@src='assets/images/images.jpg']")
	private WebElement imgclick;
	public WebElement getImgclick() {
		return imgclick;
	}


	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath ="//a[@href='logout.php']")
	private WebElement logout;
	
		
	
	
	 
	public void logout() {
		imgclick.click();
		logout.click();		}

	

	
	
}
