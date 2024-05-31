package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Patient  extends WebDriverUtility{
	WebDriver driver;
	 public Patient(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
}
	  public WebDriver getDriver() {
		return driver;
	}
	public WebElement getDoctorSpecializationdropdown() {
		return DoctorSpecializationdropdown;
	}
	public WebElement getDoctordropdwon() {
		return Doctordropdwon;
	}
	public WebElement getDate() {
		return Date;
	}
	public WebElement getTime() {
		return Time;
	}
	public WebElement getSubmitbttton() {
		return submitbttton;
	}
	@FindBy(name = "Doctorspecialization")
	private WebElement DoctorSpecializationdropdown;
	  @FindBy(id = "doctor")
	  private WebElement Doctordropdwon;
	  @FindBy(name = "appdate")
	  private WebElement Date;
	  @FindBy(id = "timepicker1")
	  private WebElement Time;
	  @FindBy(name = "submit")
	  private WebElement submitbttton;
	  public WebElement getBookappointment() {
		return bookappointment;
	}
	public WebElement getAppointmenthistory() {
		return Appointmenthistory;
	}
	public WebElement getMedicalhistory() {
		return Medicalhistory;
	}
	@FindBy(xpath = "//span[.=' Book Appointment ']")
	private WebElement bookappointment;
	  @FindBy(xpath = "//span[.=' Appointment History ']")
	  private WebElement Appointmenthistory; 
	  @FindBy(xpath = "//span[.=' Medical History ']")
	  private WebElement Medicalhistory; 
	  @FindBy(xpath = "//select[@name='Doctorspecialization']")
		private WebElement DoctorSpecialization;
		public WebElement getDoctorSpecialization() {
			return DoctorSpecialization;
}
}
