package healthcare.HMS.admin;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.Adminpage;
import com.comcast.crm.objectrepositoryutility.Doctorpage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.Patient;
/**
 * @author avinash
 */


@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class Doctorcancelappoitnment  extends BaseClass{
	@Test(groups = "regressionTest")
	public void doctorcancelappoitnmentforpatient() throws Throwable
	{
		String USERNAME = System.getProperty("usernamed" , fLib.getDataFromPropertiesFile("usernamed"));
		String PASSWORD = System.getProperty("passwordd" , fLib.getDataFromPropertiesFile("passwordd"));
		/* step1: read the data from the property file */
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		Home hm=new Home(driver);
		hm.getDoctorslogin().click();
		/* step2: login to the doctorlogin */
		UtilityClassObject.getTest().log(Status.PASS, "login to the doctorlogin ");
		LoginPage lp=new LoginPage(driver);
	  lp.logindoctor(USERNAME, PASSWORD);
	  /* step3: enter the user name and password  doctor */
	  UtilityClassObject.getTest().log(Status.PASS, " enter the user name and password  doctor ");
	 Doctorpage dg=new Doctorpage(driver);
	 dg.getUpdateProfileLink().click();
	 /* step4: cilck on update profile */
	 UtilityClassObject.getTest().log(Status.PASS, "cilck on update profile ");
	 dg.getDoctorClinicAddEdit().clear();
	 String ele = eLib.getDataFromExcel("Sheet1", 1, 1);
	 /* step5: read the data from the excel and enter the data into the address filed */
	 UtilityClassObject.getTest().log(Status.PASS, "read the data from the excel and enter the data into the address filed ");
	 dg.getDoctorClinicAddEdit().sendKeys(ele);
		dg.getUpdateBtn().click();
		/* step7: update profile */
		UtilityClassObject.getTest().log(Status.PASS, "update profile ");
		dw.switchtoAlertAndAccept(driver);
		String headerinfo = dg.getEditDoctorHeaderInfo().getText();
		String actucalinfo= eLib.getDataFromExcel("Sheet1", 1, 3);
		Assert.assertEquals(headerinfo,actucalinfo);
		/* step8: here check page conformation */
		UtilityClassObject.getTest().log(Status.PASS, "here check page conformation ");
		dg.getAppointmentHistoryLink().click();
		dg.getDoctorAppointmentcancelBtn().click();
		/* step9: here we cancel the appointment */
		UtilityClassObject.getTest().log(Status.PASS, " here we cancel the appointment ");
		dw.switchtoAlertAndAccept(driver);
		String alertmessage = dg.getDoctorAppointmentCancelMsg().getText();
		String actualmeeeasge= eLib.getDataFromExcel("Sheet1", 0, 2);
		Assert.assertEquals(alertmessage,actualmeeeasge);
		/* step10:here we check after cancel message is displayed */
		UtilityClassObject.getTest().log(Status.PASS, "here we check after cancel message is displayed ");
		dg.getSearchBtn().click();
		 String ele1 = eLib.getDataFromExcel("Sheet1", 1, 2);
		dg.getSearchEdit().sendKeys(ele1);
		/* step11: here we check the patient present  */
		UtilityClassObject.getTest().log(Status.PASS, " here we check the patient present");
		hm.logout();
	}
	@Test(groups = "regressionTest")
	public void logintodoctordeleteprofile() throws Throwable
	{
		String USERNAME = System.getProperty("usernamed" , fLib.getDataFromPropertiesFile("usernamed"));
	String PASSWORD = System.getProperty("passwordd" , fLib.getDataFromPropertiesFile("passwordd"));
	/* step1: read the data from the property file */
	UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
	Home hm=new Home(driver);
	hm.getDoctorslogin().click();
	/* step2: login to the doctorlogin */
	UtilityClassObject.getTest().log(Status.PASS, "login to the doctorlogin ");
	LoginPage lp=new LoginPage(driver);
  lp.logindoctor(USERNAME, PASSWORD);
  /* step3: enter the user name and password  doctor */
  UtilityClassObject.getTest().log(Status.PASS, " enter the user name and password  doctor ");
  Doctorpage dg=new Doctorpage(driver);
  dg.getImgclick().click();
	dg.getMyprofile().click();
	/* step3: enter the my profile throught the userimgage*/
	UtilityClassObject.getTest().log(Status.PASS, " enter the my profile throught the userimgage");
	WebElement ele = dg.getDoctorSpecialization();
	String info= eLib.getDataFromExcel("Sheet1", 1, 4);
	dw.select(ele, info);
	dg.getUpdateBtn().click();
	dw.switchtoAlertAndAccept(driver);	
	hm.logout();
	UtilityClassObject.getTest().log(Status.PASS, "here we update the doctor specialization");
	String USERNAMEd = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
	String PASSWORDd = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
	hm.getAdminlogin().click();
	lp.loginadmin(USERNAMEd, PASSWORDd);
	UtilityClassObject.getTest().log(Status.PASS, "login to the adminlogin ");
	Adminpage ap=new Adminpage(driver);
	ap.getDocdropdown().click();
	ap.getManageDoctors().click();
	ap.getCanceliconlink().click();
	dw.switchtoAlertAndAccept(driver);
	hm.logout();
	UtilityClassObject.getTest().log(Status.PASS, "here we delete the doctor detalies throught canacel icon link ");
	hm.getDoctorslogin().click();
	lp.logindoctor(USERNAME, PASSWORDd);
	UtilityClassObject.getTest().log(Status.PASS, "here we check the deleted doctor detalies in doctor login page ");
	
	}
	@Test(groups = {"smokeTest", "regressionTest"})
	public void Deleteuserpatientrecord() throws Throwable
	{
		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		Home hm=new Home(driver);
		LoginPage lp=new LoginPage(driver);
		hm.getAdminlogin().click();
			lp.loginadmin(USERNAME, PASSWORD);
			UtilityClassObject.getTest().log(Status.PASS, "login to the adminlogin ");
		Adminpage ap=new Adminpage(driver);
		ap.getDocdropdown().click();
		ap.getManageDoctors().click();
		ap.getCanceliconlink().click();
		dw.switchtoAlertAndAccept(driver);
		UtilityClassObject.getTest().log(Status.PASS, "here we delete the doctor detalies throught canacel icon link ");
		hm.logout();
		
	}
	@Test(groups = "regressionTest")
	public void checkappdoctorspcila() throws Throwable
	{
		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		Home hm=new Home(driver);
		LoginPage lp=new LoginPage(driver);
		hm.getAdminlogin().click();
		lp.loginadmin(USERNAME, PASSWORD);
		UtilityClassObject.getTest().log(Status.PASS, "login to the adminlogin ");
		Adminpage ap=new Adminpage(driver);
		ap.getDocdropdown().click();
		ap.getDoctorSpecialization().click();
		String info= eLib.getDataFromExcel("Sheet1", 1, 5);
		ap.getDocspecEdt().sendKeys(info);
		ap.getsubmitall().click();
		String meesage = ap.getAlertmeeasgeaddspcialezationdoctor().getText();
		Assert.assertEquals(meesage,"Doctor Specialization added successfully !!");
		hm.logout();
		String USERNAMEp = System.getProperty("username" , fLib.getDataFromPropertiesFile("usernamep"));
		String PASSWORDp = System.getProperty("password" , fLib.getDataFromPropertiesFile("passwordp"));
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		hm.getPatients().click();
		lp.loginpatient(USERNAMEp, PASSWORDp);
		UtilityClassObject.getTest().log(Status.PASS, "login to the patientlogin ");
		Patient pt=new Patient(driver);
		pt.getBookappointment().click();
		WebElement ele = pt.getDoctorSpecialization();
		dw.select(ele, info);
		UtilityClassObject.getTest().log(Status.PASS,"here we check the doctor specialization ");
		hm.logout();
	}
	@Test(groups = {"smokeTest", "regressionTest"})
	public void loginasadminandcheckdoctorloginlogoutdetails() throws Throwable
	{

		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		Home hm=new Home(driver);
		LoginPage lp=new LoginPage(driver);
		hm.getAdminlogin().click();
		lp.loginadmin(USERNAME, PASSWORD);
		UtilityClassObject.getTest().log(Status.PASS, "login to the adminlogin ");
		Adminpage ap=new Adminpage(driver);
		ap.getDoctorSessionLogs().click();
		UtilityClassObject.getTest().log(Status.PASS, "here we check the doctorsessionlomgs ");
		hm.logout();
		
	}
	@Test(groups = "regressionTest")
	public void loginasadminteam() throws Throwable
	{

		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
		UtilityClassObject.getTest().log(Status.PASS, "read the data from the property file ");
		Home hm=new Home(driver);
		LoginPage lp=new LoginPage(driver);
		hm.getAdminlogin().click();
		lp.loginadmin(USERNAME, PASSWORD);
		UtilityClassObject.getTest().log(Status.PASS, "login to the adminlogin ");
		Adminpage ap=new Adminpage(driver);
		ap.getDocdropdown().click();
		ap.getManageDoctors().click();
		ap.getPenciliconlink().click();
		UtilityClassObject.getTest().log(Status.PASS, "here we navigate the doctor dropdwon and manahe doctor and navigate throught pencileedit");
		WebElement sp = ap.getEditdoctorsp();
		String info= eLib.getDataFromExcel("Sheet1", 1, 4);
		dw.select(sp, info);
		ap.getManagedocname().clear();
		ap.getManagedocname().sendKeys(info);
		ap.getDoctorConsultancyFees().clear();
		String Amount= eLib.getDataFromExcel("Sheet1", 2, 2);
		ap.getManagedocname().sendKeys(Amount);
		ap.getEditsubmitbutton().click();
		UtilityClassObject.getTest().log(Status.PASS, "here we update the doctor fee and doctor address");
		hm.logout();
	}

	

}
