package org.iit.mmp.adminmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewMessagesPage {

	
	WebDriver driver;
	public ViewMessagesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public boolean fetchMessageDetails(String expectedReason,String expectedSubject,String expectedPatientName)
	{
		boolean result = false;
		String actualReason=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td[2]")).getText().trim();
		String actualSubject=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[3]/td[2]")).getText().trim();
		String actualPatientName=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]")).getText().trim();
		
		if((actualReason.equals(expectedReason))&&(expectedSubject.equals(actualSubject))&&(actualPatientName.equals(expectedPatientName)))
		{
			result= true;
		}
		return result;
			
	}
}
