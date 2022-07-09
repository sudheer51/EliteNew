package org.iit.mmp.patientmodule.pages;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateProfilePage {
	WebDriver driver;
	HashMap<String,String> expectedhMap = new HashMap<String,String>();
	HashMap<String,String> actualhMap = new HashMap<String,String>();	
	public UpdateProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public boolean validateEditCityField()
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
	public boolean validateEditStateField()
	{
		Random rand = new Random();
		String expectedState="QAAUTState"+ (char)(65+rand.nextInt(26));
		driver.findElement(By.id("Ebtn")).click();
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys(expectedState);	
		driver.findElement(By.id("Sbtn")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		String actualState=driver.findElement(By.id("state")).getAttribute("value");
		return expectedState.equals(actualState);
		
	}
	public void editState()
	{
		Random rand = new Random();
		String expectedState="QAAUTState"+ (char)(65+rand.nextInt(26));
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys(expectedState);	
		expectedhMap.put("state",expectedState);
	}
	public void editCity()
	{
		Random rand = new Random();
		String expectedCity="QAAUTCITY"+ (char)(65+rand.nextInt(26));
 		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(expectedCity);
		expectedhMap.put("city",expectedCity);
	}
	public boolean editAllFields()
	{
		clickEditButton();
		editState();
		editCity();
		submitData();
		fetchAllData();
		return actualhMap.equals(expectedhMap);
	}
	public void clickEditButton()
	{
		
		driver.findElement(By.id("Ebtn")).click();

	}
	public HashMap<String, String> fetchAllData()
	{
		String actualCity=driver.findElement(By.id("city")).getAttribute("value");
		String actualState=driver.findElement(By.id("state")).getAttribute("value");
		actualhMap.put("city",actualCity);
		actualhMap.put("state",actualState);
		return actualhMap;
		
	}
	public void submitData()
	{
		driver.findElement(By.id("Sbtn")).click();
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
	}

	public boolean editRandomFields()
	{
		Random rand = new Random();
		int i = 1+rand.nextInt(2);
		boolean result = false;
		switch(i)
		{
			case 1:
				 
				result = validateEditCityField();
				System.out.println("city");
				break;
			case 2:
				 
				result = validateEditStateField();
				System.out.println("state");
				break;
		}
	
		return result;
	}
}
