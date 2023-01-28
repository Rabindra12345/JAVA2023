package rabindra.javadatetimePractice.old;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarClass {

	public static void main(String[] args) {

		GregorianCalendar gc= new GregorianCalendar();
		
		//output format:Tue Jan 10 23:24:17 NPT 2023
		//System.out.println(gc.getTime());
		
		//to check whether the year is leap year or not 
		//System.out.println(gc.isLeapYear(2023));
		
		//it gives the zone id , offset year, month , week of the year ,day of the month etc.
		//like instance of obj
		//System.out.println(Calendar.getInstance().toString());
		
		//here the get only takes integer as a parameter , date show current day number i.e
		//if its 20th of the jan then it simply shows the 20 in the output 
		//System.out.println(gc.get(Calendar.DATE));
		
		//LETS SEE WHAT Caldenr.AM does in am its showing like month and pm shows year i guuess, i m not sure..
		//System.out.println(gc.get(Calendar.PM));
		
		//MONTH STARTS FROM THE 0 ONWARDS .......
		//System.out.println(gc.get(Calendar.MONTH));
		
		//System.out.println(gc.get(Calendar.ZONE_OFFSET));
		
		
		//IT GIVES HOUR IN THE 24 HOURS FORMAT
		//System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		
		//IT GIVES HOUR IN THE 12 HOUR FORMAT
		//System.out.println(gc.get(Calendar.HOUR));
		
		//DAY OF THE WEEK STARTS FROM THE 1 ONWARDS ....1 MEANS SUNDAY, 2 MEANS MONDAY AND SO ON ......
		//System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		
		//DAY OF THE YEAR: TO SEE HOW MAY DAY HAS PASSED TILL SPECIFIED DATE
		//System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		
		//SHOWS DATE AND TIME IN THE FORMAT AS, print currents UTC TIME, 
		//not your local time here z at the end of time string mens utc time : 2023-01-11T17:03:54.052Z
//		System.out.println(gc.toInstant());
		
		//IT SHOW TYPE AS :gregory
//		System.out.println(gc.getCalendarType());
		
		//how instance of grego... calendar, having id, zone etc...
		System.out.println(gc);
		
		

		
		


		
		
		
	}

}
