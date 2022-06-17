package org.iit.mmp.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperClass {

	WebDriver driver;
	public HelperClass(WebDriver driver)
	{
		this.driver = driver;
	}
	public void navigationToAModule(String moduleName) 
	{
		driver.findElement(By.xpath("//span[normalize-space()='"+moduleName+"']")).click();
	}
	public void login(String uname,String pword)
	{
		//Login
				driver.findElement(By.id("username")).sendKeys(uname);
				driver.findElement(By.id("password")).sendKeys(pword);
				driver.findElement(By.cssSelector("input[value='Sign In']")).click();
	}
	 
}
