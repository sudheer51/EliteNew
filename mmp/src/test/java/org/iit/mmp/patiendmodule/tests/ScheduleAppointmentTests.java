package org.iit.mmp.patiendmodule.tests;
import org.iit.mmp.patientmodule.pages.ScheduleAppointmentPage;
import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ScheduleAppointmentTests extends TestBaseClass {
	 
	@Parameters({"doctor"})
	@Test(description="TC_001 Validation of book Appointment")
	public void validateBookAppointmentTest(String doctor)
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Schedule Appointment");
		ScheduleAppointmentPage sPage = new ScheduleAppointmentPage(driver);
		boolean result = sPage.bookAppointment(doctor);
		Assert.assertTrue(result);
		System.out.println("Book Appointment is successfully updated in the home page in the mmp");
	 
	}
	 
	 
}
