package rabindra.javadatetimePractice.jodatimeapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

public class LocalDatePractice {

	public static void main(String[] args) {
		
		//This returns the current date according to my pc time
		//LocalDate date =  LocalDate.now();
		
		LocalDate date = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(date);
		
		
	}
}
