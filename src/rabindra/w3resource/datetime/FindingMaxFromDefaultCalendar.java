package rabindra.w3resource.datetime;

import java.util.Calendar;

public class FindingMaxFromDefaultCalendar {

	public static void main(String[] args) {

		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(" Maximum year "+cal.getMaximum(cal.YEAR));
		
		System.out.println("Max day of month "+cal.getMaximum(cal.DAY_OF_MONTH));
		
		System.out.println("Max of month "+cal.getMaximum(cal.MONTH));
		
		System.out.println("Max week of month "+cal.getMaximum(cal.WEEK_OF_MONTH));
		
		
	}

}
