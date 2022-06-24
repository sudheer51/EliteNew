package org.iit.mmp.adminmodule.tests;

import org.iit.mmp.adminmodule.pages.ViewMessagesPage;
import org.iit.mmp.patientmodule.pages.SendMessagesPage;
import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ViewMessagesE2ETests extends TestBaseClass{


	@Parameters({"reason","subject"})
	@Test(description="TC_003 validate E2E Send MEssages Functionality")
	public void validateE2EMessagesTest(String reason,String subject)
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Messages");
		SendMessagesPage msgPage = new SendMessagesPage(driver);
		msgPage.sendMessage(reason,subject);
		helper.launchBrowser(pro.getProperty("adminurl"));
		helper.login(pro.getProperty("adminusername"), pro.getProperty("adminpassword"));
		helper.navigationToAModule("Messages");
		ViewMessagesPage viewPage = new ViewMessagesPage(driver);
		boolean result = viewPage.fetchMessageDetails(reason, subject,pro.getProperty("patientname"));
		Assert.assertTrue(result);
		
		
	}
	
}
