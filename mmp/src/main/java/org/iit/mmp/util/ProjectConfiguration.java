package org.iit.mmp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfiguration {
	
	public Properties loadProperties() throws IOException
	{
		String filePath = System.getProperty("user.dir")+"\\config\\mmp.properties";
		File propFile = new File(filePath);
		FileInputStream fis = new FileInputStream(propFile);
		Properties pro = new Properties();
		pro.load(fis);
		return pro;
	}

}
