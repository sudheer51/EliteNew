package org.iit.mmp.patientmodule.tests;

import org.iit.mmp.patientmodule.pages.SendMessagesPage;
import org.iit.mmp.util.HelperClass;
import org.iit.mmp.util.TestBaseClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendMessagesTests extends TestBaseClass{

	@Parameters({"reason","subject"})
	@Test(description="TC_002 validate Send MEssages Functionality")
	public void validateSendMessagesTest(String reason,String subject)
	{
		 
		HelperClass helper = new HelperClass(driver);
		helper.login(pro.getProperty("patientusername"),pro.getProperty("patientpassword"));
		helper.navigationToAModule("Messages");
		SendMessagesPage msgPage = new SendMessagesPage(driver);
		String expectedMsg="Messages Successfully sent.";
		String actualMsg = msgPage.sendMessage(reason,subject);
		Assert.assertEquals(actualMsg,expectedMsg);
	}
	
}
