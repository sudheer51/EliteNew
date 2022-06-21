package org.iit.mmp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practise {
	
	public static void main(String[] args) {
//		String date = "30/December/2023";
//		String dateArray[]=	date.split("/"); //-> 30 December 2023
//		System.out.println(dateArray[0]);
//		System.out.println(dateArray[1]);
//		System.out.println(dateArray[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 50);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(sdf.format(cal.getTime()));
	}

}
