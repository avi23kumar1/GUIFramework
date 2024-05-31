package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Adminpage extends WebDriverUtility{
	WebDriver driver;
	 public Adminpage(WebDriver driver) {             
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	        
		
	@FindBy(xpath = "//span[text()=' Doctors ']")
	private WebElement docdropdown;
	 
	@FindBy(xpath = "//span[text()= 'Add Doctor']")
	private WebElement adddocdrpdwn;
	 
	@FindBy(xpath ="//span[text()=' Doctor Specialization ']")
	private WebElement docspecdrpdwn;
		
	@FindBy(xpath = "//input[@name='doctorspecilization']")
	private WebElement docspecEdt;
	
	@FindBy(name = "submit")
	private WebElement submitall;
	
	@FindBy(name = "clinicaddress")
	private WebElement docclicaddEdt;
	
	@FindBy(name = "docfees")
	private WebElement docfeeEdt;
	
	@FindBy(name = "doccontact")
	private WebElement doccontactnoEdt;
	
	@FindBy(name = "docemail")
	private WebElement docemailEdt;
	
	@FindBy(name = "submit")
	private WebElement updateBtn;
		
	@FindBy(xpath = "(//div[@class='item-inner'])[1]")
	private WebElement usersdropdown;

	@FindBy(xpath="//span[text()= 'Manage Doctors']")
	private WebElement managedoclink;
	
	@FindBy(xpath="//span[text()=' Manage Users '] ")
	private WebElement manageuserslink;
	
	@FindBy(xpath="(//i[@class='fa fa-times fa fa-white'])[1]")
	private WebElement canceliconlink;
	
	@FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
	private WebElement penciliconlink;
	
	@FindBy(name = "docname")
	private WebElement managedocname;
	
	@FindBy(name = "docname")
	private WebElement docname;

	public WebElement getUsersdropdown() {
		return usersdropdown;
	}

	public WebElement getManageuserslink() {
		return manageuserslink;
	}

	public WebElement getCanceliconlink() {
		return canceliconlink;
	}
	
	
	public WebElement getAdddocdrpdwn() {
		return adddocdrpdwn;
	}

	public WebElement getDocspecdrpdwn() {
		return docspecdrpdwn;
	}

	public WebElement getDocspecEdt() {
		return docspecEdt;
	}

	public WebElement getsubmitall() {
		return submitall;
	}

	public WebElement getDocclicaddEdt() {
		return docclicaddEdt;
	}

	public WebElement getDocfeeEdt() {
		return docfeeEdt;
	}

	public WebElement getDoccontactnoEdt() {
		return doccontactnoEdt;
	}
	public WebElement getManagedoclink() {
		return managedoclink;
	}

	public WebElement getPenciliconlink() {
		return penciliconlink;
	}

	public WebElement getManagedocname() {
		return managedocname;
	}

	public WebElement getDocname() {
		return docname;
	}

	public WebElement getDocemailEdt() {
		return docemailEdt;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public WebElement getDocdropdown() {
	return docdropdown;
	}
	@FindBy(xpath="//span[text()= ' Doctors ']/../../../..//li[3]")
	private WebElement  ManageDoctors ;    
	public WebElement getManageDoctors() {
		return ManageDoctors;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getDoctorSpecialization() {
		return DoctorSpecialization;
	}

	public WebElement getAddDoctor() {
		return AddDoctor;
	}


	@FindBy(xpath="//span[text()=' Users ']/../../../..//li")
	private WebElement  ManageUsers ;
	@FindBy(xpath="//span[text()= ' Doctors ']/../../../..//li[1]")
	private WebElement DoctorSpecialization;
	@FindBy(xpath="//span[text()= ' Doctors ']/../../../..//li[2]")
	private WebElement  AddDoctor;
	@FindBy(xpath="//p[@style='color:red;']")
	private WebElement  Alertmeeasgeaddspcialezationdoctor;
	public WebElement getAlertmeeasgeaddspcialezationdoctor() {
		return Alertmeeasgeaddspcialezationdoctor;
	}
	@FindBy(xpath="//span[text()=' Doctor Session Logs ']")
	private WebElement DoctorSessionLogs ;
	public WebElement getDoctorSessionLogs() {
		return DoctorSessionLogs;
	}

	public WebElement getUserSessionLogs() {
		return UserSessionLogs;
	}


	@FindBy(xpath="//span[text()=' User Session Logs ']")
	private WebElement  UserSessionLogs  ;
	@FindBy(xpath = "//select[@required='required']")
	private WebElement editdoctorsp;
	public WebElement getEditdoctorsp() {
		return editdoctorsp;
	}
	
	@FindBy(xpath="//input[@name='docfees']")
	private WebElement  DoctorConsultancyFees ;
	public WebElement getDoctorConsultancyFees() {
		return DoctorConsultancyFees;
	}	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement  editsubmitbutton;
	public WebElement getEditsubmitbutton() {
		return editsubmitbutton;
	}
	@FindBy(xpath="//span[text()=' Reports ']")
	private WebElement   Reports;
	public WebElement getReports() {
		return Reports;
	}

	public WebElement getFromdate() {
		return fromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getBwdatesreports() {
		return Bwdatesreports;
	}


	@FindBy(xpath="//input[@id='fromdate']")
	private WebElement   fromdate;
	@FindBy(xpath="//input[@id='todate']")
	private WebElement   todate;
	@FindBy(xpath="//span[text()='B/w dates reports ']")
	private WebElement   Bwdatesreports ;
	
}

