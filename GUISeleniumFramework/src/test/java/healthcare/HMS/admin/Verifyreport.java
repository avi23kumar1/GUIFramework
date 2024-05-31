package healthcare.HMS.admin;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.objectrepositoryutility.Adminpage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
@Listeners(com.comcast.crm.generic.listenerutility.ListImpClass.class)
public class Verifyreport extends BaseClass{
	@Test(groups = "regressionTest")
	public void verifyreportinbetweendate() throws Throwable
	{
		String USERNAME = System.getProperty("username" , fLib.getDataFromPropertiesFile("username"));
		String PASSWORD = System.getProperty("password" , fLib.getDataFromPropertiesFile("password"));
		UtilityClassObject.getTest().log(Status.INFO, "read the data from the property file ");
		Home hm=new Home(driver);
		LoginPage lp=new LoginPage(driver);
		hm.getAdminlogin().click();
		lp.loginadmin(USERNAME, PASSWORD);
		UtilityClassObject.getTest().log(Status.INFO, "login to the adminlogin ");
		Adminpage ap=new Adminpage(driver);
		ap.getReports().click();
		ap.getBwdatesreports().click();
		String todate= eLib.getDataFromExcel("Sheet1", 2, 0);
		String fromdate= eLib.getDataFromExcel("Sheet1", 2, 1);
		ap.getFromdate().sendKeys("31/05/2023");
		ap.getTodate().sendKeys("02/052/2023");
		UtilityClassObject.getTest().log(Status.INFO, "here we send todate and from date check the reports in between ");
		ap.getsubmitall().click();
		
	}

}
