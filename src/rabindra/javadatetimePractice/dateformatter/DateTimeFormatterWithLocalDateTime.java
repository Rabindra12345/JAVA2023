package rabindra.javadatetimePractice.dateformatter;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterWithLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		
		ZonedDateTime zdt = ZonedDateTime.now();

		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy:MM:dd hh:mm:ss");
		
		
		//to show zone information like below where z is zone. we have to use ZonedDateTime instead of LocalDateTime
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss z");

		
//		System.out.println(dtf.format(ldt));
		System.out.println(dtf.format(zdt));

//		System.out.println(ldt);
	}

}
