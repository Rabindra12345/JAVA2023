package rabindra.w3resource.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateObjUsingCalendar {

	public static void main(String[] args) {

		Calendar gc = Calendar.getInstance();
		
		
		int year = 2023;
		
		int day = 18;
		
		//Month starts from 0 so here 1 means feb
		int month =0;
		gc.clear();
		
		gc.set(gc.YEAR, year);
		gc.set(gc.MONTH, month);
		gc.set(gc.DAY_OF_MONTH, day);
		
		
		System.out.println(gc.getTime());
		
	}

}
