package org.iit.elite.mmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScheduleAppointmentTests {
	WebDriver driver;
	@Test(description="TC_001 Validation of book Appointment")
	public void validateBookAppointmentTest()
	{
		//System.setProperty("webdriver.chrome","path to chromedriver.exe");
		//Do not download any executable file chromedriver.exe/geckodriver.exe
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
		login("ria1","Ria12345");
		navigationToAModule("Schedule Appointment");
		bookAppointment("Charlie");
		System.out.println("Book Appointment is successfully updated in the home page");
		 
		 
		 
	}
	public void bookAppointment(String doctorName)
	{
		driver.findElement(By.cssSelector("input[value='Create new appointment']")).click();
		driver.findElement(By.xpath("//h4[normalize-space()='Dr."+doctorName+"']/ancestor::ul/following-sibling::button")).click();
		
		driver.switchTo().frame("myframe");
		driver.findElement(By.id("datepicker")).sendKeys("07/01/2022");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
