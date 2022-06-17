package org.iit.mmp.util;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {

	protected WebDriver driver;
	protected Properties pro;
	
	@BeforeClass
	public void instantiateDriver() throws IOException
	{
		//read the property file
		//read the key browserType
		ProjectConfiguration pConfig = new ProjectConfiguration();
		pro=pConfig.loadProperties();
		String browserType = pro.getProperty("browserType");
		if(browserType.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(pro.getProperty("patienturl"));
			driver.manage().window().maximize();
		}
		else if(browserType.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(pro.getProperty("patienturl"));
			driver.manage().window().maximize();
		}

	}

}
