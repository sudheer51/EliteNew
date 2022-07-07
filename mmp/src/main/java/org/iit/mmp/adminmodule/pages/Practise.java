package org.iit.mmp.adminmodule.pages;

import java.util.Random;

public class Practise {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int i = 1+rand.nextInt(2);
		if(i==1)
		{
			System.out.println("city");
		}
		else if(i==2)
		{
			System.out.println("state");
		}
		
		switch(i)
		{
			case 1:
				System.out.println("city");
				break;
			case 2:
				System.out.println("state");
				break;
		}
	}
}
