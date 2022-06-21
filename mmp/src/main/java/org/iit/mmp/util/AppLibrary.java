package org.iit.mmp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AppLibrary {
	
	public static String getFutureDate(String format,int noofDays)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, noofDays);
		SimpleDateFormat sdf = new SimpleDateFormat(format );
		System.out.println(sdf.format(cal.getTime()));
		return sdf.format(cal.getTime());
		
	}

}
