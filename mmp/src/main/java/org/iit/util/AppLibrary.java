package org.iit.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class AppLibrary {
	
	
	public static String getDate(int days,String format)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		System.out.println("To Date:" + cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(cal.getTime()));
		return sdf.format(cal.getTime());
	}
	public static String getRandomEmailID()
	{
		Random r1 = new Random();
		char c =  (char) (97+r1.nextInt(26));
		String emailID = c+ "EliteQATeam"+c+ r1.nextInt(100)+"@gmail.com";
		return emailID;
		 
	}
	
	

}
//dd/MMM/yyyy
//dd/MM/yyyy
		 