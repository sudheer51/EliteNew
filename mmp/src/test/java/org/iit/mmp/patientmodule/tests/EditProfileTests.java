package org.iit.mmp.patientmodule.tests;

import org.iit.mmp.patientmodule.pages.UpdateProfilePage;
import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTests extends TestBaseClass{

	
	@Test(description="Validate of Edit Profile for a single field : City",priority=2)
	public void validateEditCity()
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.launchBrowser(pro.getProperty("patienturl"));
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Profile");
		UpdateProfilePage profilePage = new UpdateProfilePage(driver);
		boolean result = profilePage.validateEditCityField();
		Assert.assertTrue(result);
		 
	}
	
	@Test(description="Validate All Fields : State & City",priority=1)
	public void validateEditAllFields()
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.launchBrowser(pro.getProperty("patienturl"));
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Profile");
		UpdateProfilePage profilePage = new UpdateProfilePage(driver);
		boolean result = profilePage.editAllFields();
		Assert.assertTrue(result);
		 
	}
	@Test(description="Validate Random Fields : State & City",priority=3)
	public void validateRandomFields()
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.launchBrowser(pro.getProperty("patienturl"));
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Profile");
		UpdateProfilePage profilePage = new UpdateProfilePage(driver);
		boolean result = profilePage.editRandomFields();
		Assert.assertTrue(result);
		 
	}
}
/**
Edit Profile:

			String expectedValue="Newyork";

			Click on Edit

			Fill the expectedValue for the City
			
			Click on Save

			String actualValue=Fetch the value


			Compare both


3 Fields to update and check


1. Check each and every single field : 3  methods
2. Edit all :
			call 3 methods in line number 1
3. Any one:1
			call any one of the 3 methods















1. Check each and every single field : 3  methods
2. Edit all :
			call 3 methods in line number 1
3. Any one:1
			call any one of the 3 methods

*/