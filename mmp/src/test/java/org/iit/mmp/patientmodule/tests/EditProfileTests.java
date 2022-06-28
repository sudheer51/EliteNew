package org.iit.mmp.patientmodule.tests;

import org.iit.mmp.patientmodule.pages.UpdateProfilePage;
import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTests extends TestBaseClass{

	
	@Test(description="Validate of Edit Profile for a single field : City")
	public void validateEditCity()
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Profile");
		UpdateProfilePage profilePage = new UpdateProfilePage(driver);
		boolean result = profilePage.editCity();
		Assert.assertTrue(result);
		 
	}
}
/**

1. Check each and every single field : 3  methods
2. Edit all :
			call 3 methods in line number 1
3. Any one:1
			call any one of the 3 methods

*/