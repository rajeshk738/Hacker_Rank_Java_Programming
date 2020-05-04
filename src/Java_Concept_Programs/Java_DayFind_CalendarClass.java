/*
 * 
 * finding the day of the date given using Calendar class
 * 
 */

package Java_Concept_Programs;

import java.util.Calendar;
import java.util.Scanner;

public class Java_DayFind_CalendarClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		
		
		Calendar c = Calendar.getInstance();
		
		c.set(year,month-1,day);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		
		String s = getDay(dayOfWeek);
		
		System.out.println(s);
		
		
		

	}

	private static String getDay(int dayOfWeek) {
		
		String day ="";
		
		switch(dayOfWeek)
		{
		case 0: day = "SUNDAY";
		break;
		case 1: day = "MONDAY";
		break;
		case 2: day = "TUESDAY";
		break;
		case 3: day = "WEDNESDAY";
		break;
		case 4: day = "THURSDAY";
		break;
		case 5: day = "FRIDAY";
		break;
		case 6: day = "SATURDAY";
		break;
		}
		
		return day;
	}
	
	

}

