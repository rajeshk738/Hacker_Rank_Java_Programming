package Java_Concept_Programs;
import java.util.Scanner;

/* You are given a date. You just need to write the method, , which returns the day on that date
 * 
 * Sample Input

   08 05 2015
   
   
   Sample Output

    WEDNESDAY
 */
class DayOfTheDate{
	
	int month, day, year;
	
	public DayOfTheDate(int month, int day, int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String getDay() {
		
		String whatDay = null;
		int noOfOddDays = 0;
		int lastyear = year;
		
		noOfOddDays = noOfOddDays + getLastYearOddDays();
		noOfOddDays = noOfOddDays + getOddDays();
		
		noOfOddDays = noOfOddDays % 7;
		
		switch(noOfOddDays)
		{
		case 0 : whatDay = "Sunday";
		break;
		case 1 : whatDay =  "Monday";
		break;
		case 2 : whatDay = "Tuesday";
		break;
		case 3 : whatDay = "Wednesday";
		break;
		case 4:  whatDay = "Thursday";
		break;
		case 5 : whatDay = "Friday";
		break;
		case 6 : whatDay =  "Satuarday";
		}
		
		return whatDay;
		
	}

	private int getLastYearOddDays() {
		
		int nod1= day;
		
		int lastmonth = month - 1;
		
		if((year%100 == 0 && year%400 == 0 ) || year%4 == 0)  // leap year condition
		{
			while(lastmonth>0)
			{
				
				switch(lastmonth)
				{
				case 1 : nod1 += 31;
				lastmonth--;
				continue;
				case 2 : nod1 += 29;
				lastmonth--;
				continue;
				case 3 : nod1 += 31;
				lastmonth--;
				continue;
				case 4 : nod1 += 30;
				lastmonth--;
				continue;
				case 5 : nod1 += 31;
				lastmonth--;
				continue;
				case 6 : nod1 += 30;
				lastmonth--;
				continue;
				case 7 : nod1 += 31;
				lastmonth--;
				continue;
				case 8 : nod1 += 31;
				lastmonth--;
				continue;
				case 9 : nod1 += 30;
				lastmonth--;
				continue;
				case 10 : nod1 += 31;
				lastmonth--;
				continue;
				case 11 : nod1 += 30;
				lastmonth--;
				continue;
				case 12 : nod1 += 31;
				lastmonth--;
				continue;				
				}
			
			}
			
		}
		
		else  // non leap year
		{
			while(lastmonth>0)
			{
				
				switch(lastmonth)
				{
				case 1 : nod1 += 31;
				lastmonth--;
				continue;
				case 2 : nod1 += 28;
				lastmonth--;
				continue;
				case 3 : nod1 += 31;
				lastmonth--;
				continue;
				case 4 : nod1 += 30;
				lastmonth--;
				continue;
				case 5 : nod1 += 31;
				lastmonth--;
				continue;
				case 6 : nod1 += 30;
				lastmonth--;
				continue;
				case 7 : nod1 += 31;
				lastmonth--;
				continue;
				case 8 : nod1 += 31;
				lastmonth--;
				continue;
				case 9 : nod1 += 30;
				lastmonth--;
				continue;
				case 10 : nod1 += 31;
				lastmonth--;
				continue;
				case 11 : nod1 += 30;
				lastmonth--;
				continue;
				case 12 : nod1 += 31;
				lastmonth--;
				continue;				
				}
			
			}
			
		}
			
		
		
		return nod1 % 7;
	}

	private int getOddDays() {
		
		int total_years = (year - 1) % 400;
		int x = total_years / 100;
		
		int leap = (total_years % 100) / 4;
		int nonleap = (total_years % 100) - leap;
		
		int nod2 = (5 * x) % 7;
		
		
		 nod2 = nod2 + (leap * 2 + nonleap * 1);
				
		return nod2 % 7;
				
	}
	
	
	
	
}


public class Java_Date_Time {

	public static void main(String[] args) {
		
		int month,day,year;
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt(); 
		day = scan.nextInt(); 
		year = scan.nextInt();
		System.out.println("Month "+month+" day "+day+" year "+year);
		
		DayOfTheDate d = new DayOfTheDate(month,day,year);
		
		String whatDay = d.getDay();
		
		System.out.println("Day of the date given: "+whatDay);
		

	}

}
