package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Doctorpage extends WebDriverUtility{
	WebDriver driver;
	 public Doctorpage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath = "(//a[@href='edit-profile.php'])[2]")
	 private WebElement updateProfileLink;
	 @FindBy(xpath = "//h1[text()='Doctor | Edit Doctor Details']")
	 private WebElement EditDoctorHeaderInfo;
	 @FindBy(name = "clinicaddress")
	 private WebElement doctorClinicAddEdit;
	 @FindBy(name = "submit")
	 private WebElement updateBtn;
	 
	 @FindBy(xpath ="//span[text()=' Search ']")
	 private WebElement searchBtn;
	 @FindBy(xpath = "Doctor | Manage Patients")
	 private WebElement managePatientsHederInfo;
	 @FindBy(xpath = "//input[@name='searchdata']")
	 private WebElement searchEdit;
	 @FindBy(xpath = "//button[@name='search']")
	 private WebElement manageSearchBtn;
	 @FindBy(xpath = "//span[text()=' Appointment History ']")
	 private WebElement appointmentHistoryLink;
	 @FindBy(xpath = "//h1[text()='Doctor  | Appointment History']")
	 private WebElement appoinmentHistoryHeaderInfo;
	 public WebElement getDoctorAppointmentcancelBtn() {
		return doctorAppointmentcancelBtn;
	}
	public WebElement getDoctorAppointmentCancelMsg() {
		return doctorAppointmentCancelMsg;
	}
	@FindBy(xpath = "//a[@title='Cancel Appointment']")
	 private WebElement doctorAppointmentcancelBtn;
	 @FindBy(xpath = "//p[text()='Appointment canceled !!								']")
	 private WebElement doctorAppointmentCancelMsg;
	 
	public WebElement getUpdateProfileLink() {
		return updateProfileLink;
	}
	public WebElement getHeaderInfo1() {
		return EditDoctorHeaderInfo;
	}
	public WebElement getDoctorClinicAddEdit() {
		return doctorClinicAddEdit;
	}
	public WebElement getUpdateBtn() {

		return updateBtn;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getEditDoctorHeaderInfo() {
		return EditDoctorHeaderInfo;
	}
	public WebElement getManagePatientsHederInfo() {
		return managePatientsHederInfo;
	}
	public WebElement getSearchEdit() {
		return searchEdit;
	}
	public WebElement getManageSearchBtn() {
		return manageSearchBtn;
	}
	public WebElement getAppointmentHistoryLink() {
		return appointmentHistoryLink;
	}
	public WebElement getAppoinmentHistoryHeaderInfo() {
		return appoinmentHistoryHeaderInfo;
	}
	@FindBy(xpath = "//img[@src='assets/images/images.jpg']")
	private WebElement imgclick;
	public WebElement getImgclick() {
		return imgclick;
	}
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]/li")
	private WebElement myprofile;
	public WebElement getMyprofile() {
		return myprofile;
	}	
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement DoctorSpecialization;
	public WebElement getDoctorSpecialization() {
		return DoctorSpecialization;
	}
}
