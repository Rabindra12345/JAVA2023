package rabindra.javadatetimePractice.old;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JavaTimeZonePractice {

	public static void main(String[] args) {

		
		//get time zone, get id, set time zone and get time zone of los angeles
		
		GregorianCalendar gc = new GregorianCalendar();
		
//		TimeZone tz = gc.getTimeZone();
		

		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
//		System.out.println(tz);
		
		System.out.println(gc.getTime());
		
		
	}

}
