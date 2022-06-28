package org.iit.mmp.patientmodule.pages;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateProfilePage {

	

	WebDriver driver;
	public UpdateProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean editCity()
	{
		Random rand = new Random();
		
		String expectedValue="QAAUTCITY"+ (char)(65+rand.nextInt(26));

		driver.findElement(By.id("Ebtn")).click();
		
		driver.findElement(By.id("city")).clear();

		driver.findElement(By.id("city")).sendKeys(expectedValue);
		
		driver.findElement(By.id("Sbtn")).click();
		
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		
		String actualValue=driver.findElement(By.id("city")).getAttribute("value");
		
		return expectedValue.equals(actualValue);
		 
	}
}
