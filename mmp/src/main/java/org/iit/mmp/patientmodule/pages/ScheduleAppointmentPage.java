package org.iit.mmp.patientmodule.pages;

import org.iit.mmp.util.AppLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointmentPage {
	
	

	WebDriver driver;
	public ScheduleAppointmentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public boolean bookAppointment(String expectedDoctor)
	{
		boolean result = false;
		driver.findElement(By.cssSelector("input[value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[normalize-space()='Dr."+expectedDoctor+"']/ancestor::ul/following-sibling::button")).click();
		driver.switchTo().frame("myframe");
		//driver.findElement(By.id("datepicker")).sendKeys("07/01/2022");	
		 
		String expectedDate = AppLibrary.getFutureDate("dd/MMMM/yyyy" , 20);
		
		String dateArray[]=	expectedDate.split("/"); //-> 30 December 2023
		String expectedYear = dateArray[2];
		String actualYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 
		 while(!(actualYear.equals(expectedYear)))
		 {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				actualYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 }
		 
		 String expectedMonth=dateArray[1];
		 String actualMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 
		 while(!(actualMonth.equals(expectedMonth)))
		 {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				actualMonth =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 }
		 String day=dateArray[0];
		 driver.findElement(By.linkText(day)).click();
		 Select timeSelect = new Select(driver.findElement(By.id("time")));
		 String exptectedTime="10Am";
		 timeSelect.selectByVisibleText(exptectedTime);
		 driver.findElement(By.id("ChangeHeatName")).click();
		 String exptectedSym="Fever and Cold";
		 driver.findElement(By.id("sym")).sendKeys(exptectedSym);
		 driver.findElement(By.cssSelector("input[value='Submit']")).submit();
		 String actualDate = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[1]")).getText();
		 String actualTime = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]")).getText();
		 String actualSym = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[3]")).getText();
		 String actualDoctor = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[4]")).getText();
		 if((actualDate.equals(expectedDate))&&(actualTime.equals(exptectedTime))&&(actualSym.equals(exptectedSym))&&(expectedDoctor.equals(actualDoctor)))
		 {
			result = true;
		 } 
		 return result;
	}
}
