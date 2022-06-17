package org.iit.elite.mmp.patiendmodule.tests;

import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.openqa.selenium.By;
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
		bookAppointment(doctor);
		System.out.println("Book Appointment is successfully updated in the home page in the mmp");
	 
	}
	public void bookAppointment(String doctorName)
	{
		driver.findElement(By.cssSelector("input[value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[normalize-space()='Dr."+doctorName+"']/ancestor::ul/following-sibling::button")).click();
		driver.switchTo().frame("myframe");
		driver.findElement(By.id("datepicker")).sendKeys("07/01/2022");	
		
	}
	 
}
